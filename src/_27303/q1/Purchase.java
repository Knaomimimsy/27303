package _27303.q1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Purchase extends StockItem {
    private LocalDate purchaseDate;
    private int purchasedQuantity; // > 0
    private String supplierNameOverridden;

    public Purchase(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    LocalDate purchaseDate, int purchasedQuantity, String supplierNameOverridden) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        setPurchaseDate(purchaseDate);
        setPurchasedQuantity(purchasedQuantity);
        setSupplierNameOverridden(supplierNameOverridden);
    }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) {
        if (purchaseDate == null) throw new IllegalArgumentException("purchaseDate cannot be null");
        this.purchaseDate = purchaseDate;
    }

    public int getPurchasedQuantity() { return purchasedQuantity; }
    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("purchasedQuantity must be > 0");
        this.purchasedQuantity = purchasedQuantity;
    }

    public String getSupplierNameOverridden() { return supplierNameOverridden; }
    public void setSupplierNameOverridden(String supplierNameOverridden) {
        if (supplierNameOverridden == null || supplierNameOverridden.trim().isEmpty()) throw new IllegalArgumentException("supplierNameOverridden required");
        this.supplierNameOverridden = supplierNameOverridden.trim();
    }

    @Override
    public String toString() {
        return "Purchase{product=" + getProductName() + ", purchased=" + purchasedQuantity + ", date=" + purchaseDate + ", supplier=" + supplierNameOverridden + "}";
    }
}
