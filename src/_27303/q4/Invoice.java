package _27303.q4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount;

    public Invoice(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, LocalDate orderDate, double totalAmount,
                   LocalDate deliveryDate, String deliveredBy,
                   String inspectorName, String status, String remarks,
                   String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy,
                inspectorName, status, remarks);

        setInvoiceNo(invoiceNo);
        setInvoiceAmount(invoiceAmount);
    }

    public String getInvoiceNo() { return invoiceNo; }
    public void setInvoiceNo(String invoiceNo) {
        if (invoiceNo == null || invoiceNo.isBlank())
            throw new IllegalArgumentException("invoiceNo required");
        this.invoiceNo = invoiceNo;
    }

    public double getInvoiceAmount() { return invoiceAmount; }
    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount <= 0)
            throw new IllegalArgumentException("invoiceAmount must be > 0");
        this.invoiceAmount = invoiceAmount;
    }
}
