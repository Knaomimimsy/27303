package _27303.q1;

import java.time.LocalDateTime;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone; // 10 digits

    public Supplier(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode);
        setSupplierName(supplierName);
        setSupplierEmail(supplierEmail);
        setSupplierPhone(supplierPhone);
    }

    public String getSupplierName() { return supplierName; }
    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.trim().isEmpty()) throw new IllegalArgumentException("supplierName required");
        this.supplierName = supplierName.trim();
    }

    public String getSupplierEmail() { return supplierEmail; }
    public void setSupplierEmail(String supplierEmail) {
        if (supplierEmail == null || !supplierEmail.matches("^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$"))
            throw new IllegalArgumentException("invalid supplierEmail");
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierPhone() { return supplierPhone; }
    public void setSupplierPhone(String supplierPhone) {
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}")) throw new IllegalArgumentException("supplierPhone must be 10 digits");
        this.supplierPhone = supplierPhone;
    }

    @Override
    public String toString() {
        return "Supplier{" + supplierName + "," + supplierEmail + "," + supplierPhone + "}";
    }
}
