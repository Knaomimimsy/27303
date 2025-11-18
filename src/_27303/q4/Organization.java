package _27303.q4;

import java.time.LocalDateTime;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                        String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        setOrgName(orgName);
        setAddress(address);
        setContactEmail(contactEmail);
    }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) {
        if (orgName == null || orgName.isBlank()) throw new IllegalArgumentException("orgName required");
        this.orgName = orgName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        if (address == null || address.isBlank()) throw new IllegalArgumentException("address required");
        this.address = address;
    }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) {
        if (!contactEmail.matches("^[\\w-.]+@[\\w-]+\\.[A-Za-z]{2,}$"))
            throw new IllegalArgumentException("Invalid email");
        this.contactEmail = contactEmail;
    }
}
