package _27303.q3;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN; // valid TIN (9 digits)
    private String contact; // phone = 10 digits

    public Employer(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address);
        setEmployerName(employerName);
        setEmployerTIN(employerTIN);
        setContact(contact);
    }

    public String getEmployerName() { return employerName; }
    public void setEmployerName(String employerName) throws TaxDataException {
        if (employerName == null || employerName.trim().isEmpty()) throw new TaxDataException("employerName required");
        this.employerName = employerName;
    }

    public String getEmployerTIN() { return employerTIN; }
    public void setEmployerTIN(String employerTIN) throws TaxDataException {
        if (employerTIN == null || !Pattern.matches("\\d{9}", employerTIN)) throw new TaxDataException("Employer TIN must be 9 digits");
        this.employerTIN = employerTIN;
    }

    public String getContact() { return contact; }
    public void setContact(String contact) throws TaxDataException {
        if (contact == null || !Pattern.matches("\\d{10}", contact)) throw new TaxDataException("contact must be 10 digits");
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Employer{" + employerName + ", TIN=" + employerTIN + ", contact=" + contact + "}";
    }
}
