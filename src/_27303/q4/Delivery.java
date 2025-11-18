package _27303.q4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Delivery extends PurchaseOrder {
    private LocalDate deliveryDate;
    private String deliveredBy;

    public Delivery(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, LocalDate orderDate, double totalAmount,
                    LocalDate deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount);

        setDeliveryDate(deliveryDate);
        setDeliveredBy(deliveredBy);
    }

    public LocalDate getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate == null) throw new IllegalArgumentException("deliveryDate required");
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveredBy() { return deliveredBy; }
    public void setDeliveredBy(String deliveredBy) {
        if (deliveredBy == null || deliveredBy.isBlank())
            throw new IllegalArgumentException("deliveredBy required");
        this.deliveredBy = deliveredBy;
    }
}
