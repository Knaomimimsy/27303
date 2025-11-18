package _27303.q1;

import java.time.LocalDateTime;

public class StockItem extends Product {
    private int quantityAvailable; // >= 0
    private int reorderLevel;      // >= 0

    public StockItem(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit);
        setQuantityAvailable(quantityAvailable);
        setReorderLevel(reorderLevel);
    }

    public int getQuantityAvailable() { return quantityAvailable; }
    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable < 0) throw new IllegalArgumentException("quantityAvailable must be >= 0");
        this.quantityAvailable = quantityAvailable;
    }

    public int getReorderLevel() { return reorderLevel; }
    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel < 0) throw new IllegalArgumentException("reorderLevel must be >= 0");
        this.reorderLevel = reorderLevel;
    }

    @Override
    public String toString() {
        return "StockItem{" + getProductName() + ", qty=" + quantityAvailable + ", reorder=" + reorderLevel + "}";
    }
}
