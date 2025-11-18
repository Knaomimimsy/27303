package _27303.q4;

import java.time.LocalDateTime;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN; // 9 digits
    private String contact;

    public Supplier(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
        setSupplierName(supplierName);
        setSupplierTIN(supplierTIN);
        setContact(contact);
    }

    public String getSupplierName() { return supplierName; }
    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.isBlank())
            throw new IllegalArgumentException("supplierName required");
        this.supplierName = supplierName;
    }

    public String getSupplierTIN() { return supplierTIN; }
    public void setSupplierTIN(String supplierTIN) {
        if (!supplierTIN.matches("\\d{9}"))
            throw new IllegalArgumentException("supplierTIN must be 9 digits");
        this.supplierTIN = supplierTIN;
    }

    public String getContact() { return contact; }
    public void setContact(String contact) {
        if (!contact.matches("\\d{10}"))
            throw new IllegalArgumentException("contact must be 10 digits");
        this.contact = contact;
    }
}
