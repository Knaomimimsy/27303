package _27303.q1;

import java.time.LocalDateTime;

public class Product extends Supplier {
    private String productName;
    private double unitPrice; // > 0
    private int stockLimit;   // >= 0

    public Product(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode,
                   String supplierName, String supplierEmail, String supplierPhone,
                   String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);
        setProductName(productName);
        setUnitPrice(unitPrice);
        setStockLimit(stockLimit);
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) throw new IllegalArgumentException("productName required");
        this.productName = productName.trim();
    }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) throw new IllegalArgumentException("unitPrice must be > 0");
        this.unitPrice = unitPrice;
    }

    public int getStockLimit() { return stockLimit; }
    public void setStockLimit(int stockLimit) {
        if (stockLimit < 0) throw new IllegalArgumentException("stockLimit must be >= 0");
        this.stockLimit = stockLimit;
    }

    @Override
    public String toString() {
        return "Product{" + productName + ", price=" + unitPrice + ", limit=" + stockLimit + "}";
    }
}
