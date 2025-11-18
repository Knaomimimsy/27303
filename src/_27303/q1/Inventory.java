package _27303.q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Inventory extends Sale {
    private List<StockItem> stockItems = new ArrayList<>();
    private List<Purchase> purchases = new ArrayList<>();
    private List<Sale> sales = new ArrayList<>();

    public Inventory(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel,
                     LocalDate purchaseDate, int purchasedQuantity, String supplierNameOverridden,
                     LocalDate saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, supplierNameOverridden,
                saleDate, soldQuantity, customerName);
    }

    // convenience no-arg-ish constructor using sensible defaults (keeps validations satisfied)
    public Inventory() {
        this(1, LocalDateTime.now(), LocalDateTime.now(),
                "Default Warehouse", "Unknown", "0000000000",
                "DefaultCategory", "DEF",
                "Default Supplier", "supplier@example.com", "0000000000",
                "DefaultProduct", 1.0, 0,
                0, 0,
                LocalDate.now(), 1, "Default Supplier",
                LocalDate.now(), 1, "Default Customer");
    }

    public void addStockItem(StockItem item) {
        if (item == null) throw new IllegalArgumentException("item cannot be null");
        stockItems.add(item);
    }
    public List<StockItem> getStockItems() { return stockItems; }

    public void addPurchase(Purchase p) {
        if (p == null) throw new IllegalArgumentException("purchase cannot be null");
        purchases.add(p);
        // update corresponding stockItem if exists
        for (StockItem si : stockItems) {
            if (si.getProductName().equalsIgnoreCase(p.getProductName())) {
                si.setQuantityAvailable(si.getQuantityAvailable() + p.getPurchasedQuantity());
                return;
            }
        }
        // create minimal stock item from purchase
        StockItem newItem = new StockItem(p.getId(), LocalDateTime.now(), LocalDateTime.now(),
                "Unknown", "Unknown", "0000000000",
                "Unknown", "UNK", p.getSupplierNameOverridden(), "unknown@example.com", "0000000000",
                p.getProductName(), p.getUnitPrice(), p.getStockLimit(), p.getPurchasedQuantity(), 0);
        stockItems.add(newItem);
    }

    public void addSale(Sale s) {
        if (s == null) throw new IllegalArgumentException("sale cannot be null");
        sales.add(s);
        for (StockItem si : stockItems) {
            if (si.getProductName().equalsIgnoreCase(s.getProductName())) {
                int remaining = si.getQuantityAvailable() - s.getSoldQuantity();
                if (remaining < 0) remaining = 0;
                si.setQuantityAvailable(remaining);
                return;
            }
        }
    }

    // totals used by report
    public int totalItemsCount() {
        int total = 0;
        for (StockItem si : stockItems) total += si.getQuantityAvailable();
        return total;
    }

    public double totalStockValue() {
        double value = 0.0;
        for (StockItem si : stockItems) value += si.getQuantityAvailable() * si.getUnitPrice();
        return value;
    }

    public int totalSoldQuantity() {
        int total = 0;
        for (Sale s : sales) total += s.getSoldQuantity();
        return total;
    }

    public List<Purchase> getPurchases() { return purchases; }
    public List<Sale> getSales() { return sales; }
}
