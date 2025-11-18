package _27303.q1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sale extends Purchase {
    private LocalDate saleDate;
    private int soldQuantity; // > 0
    private String customerName;

    public Sale(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
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
                purchaseDate, purchasedQuantity, supplierNameOverridden);
        setSaleDate(saleDate);
        setSoldQuantity(soldQuantity);
        setCustomerName(customerName);
    }

    public LocalDate getSaleDate() { return saleDate; }
    public void setSaleDate(LocalDate saleDate) {
        if (saleDate == null) throw new IllegalArgumentException("saleDate cannot be null");
        this.saleDate = saleDate;
    }

    public int getSoldQuantity() { return soldQuantity; }
    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity <= 0) throw new IllegalArgumentException("soldQuantity must be > 0");
        this.soldQuantity = soldQuantity;
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) throw new IllegalArgumentException("customerName required");
        this.customerName = customerName.trim();
    }

    @Override
    public String toString() {
        return "Sale{product=" + getProductName() + ", sold=" + soldQuantity + ", date=" + saleDate + ", customer=" + customerName + "}";
    }
}
