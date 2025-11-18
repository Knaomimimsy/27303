package _27303.q4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PurchaseOrder extends Product {
    private String poNumber;
    private LocalDate orderDate;
    private double totalAmount;

    public PurchaseOrder(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                         String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, LocalDate orderDate, double totalAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity);

        setPoNumber(poNumber);
        setOrderDate(orderDate);
        setTotalAmount(totalAmount);
    }

    public String getPoNumber() { return poNumber; }
    public void setPoNumber(String poNumber) {
        if (poNumber == null || poNumber.isBlank())
            throw new IllegalArgumentException("poNumber required");
        this.poNumber = poNumber;
    }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) {
        if (orderDate == null) throw new IllegalArgumentException("orderDate required");
        this.orderDate = orderDate;
    }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) {
        if (totalAmount <= 0) throw new IllegalArgumentException("totalAmount must be > 0");
        this.totalAmount = totalAmount;
    }
}
