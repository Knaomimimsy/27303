package _27303.q4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status; // Passed/Failed
    private String remarks;

    public Inspection(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, LocalDate orderDate, double totalAmount,
                      LocalDate deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy);

        setInspectorName(inspectorName);
        setStatus(status);
        setRemarks(remarks);
    }

    public String getInspectorName() { return inspectorName; }
    public void setInspectorName(String inspectorName) {
        if (inspectorName == null || inspectorName.isBlank())
            throw new IllegalArgumentException("inspectorName required");
        this.inspectorName = inspectorName;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) {
        if (!status.equalsIgnoreCase("Passed") &&
                !status.equalsIgnoreCase("Failed"))
            throw new IllegalArgumentException("status must be Passed/Failed");
        this.status = status;
    }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) {
        this.remarks = (remarks == null ? "" : remarks);
    }
}
