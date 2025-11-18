package _27303.q6;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Organization extends Entity {
    private String orgName;
    private String orgCode; // >=3 chars
    private String rssbNumber; // 8 digits
    private String contactEmail;

    public Organization(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        setOrgName(orgName);
        setOrgCode(orgCode);
        setRssbNumber(rssbNumber);
        setContactEmail(contactEmail);
    }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) {
        if (orgName == null || orgName.isBlank()) throw new IllegalArgumentException("orgName required");
        this.orgName = orgName;
    }

    public String getOrgCode() { return orgCode; }
    public void setOrgCode(String orgCode) {
        if (orgCode == null || orgCode.length() < 3) throw new IllegalArgumentException("orgCode must be >= 3 chars");
        this.orgCode = orgCode;
    }

    public String getRssbNumber() { return rssbNumber; }
    public void setRssbNumber(String rssbNumber) {
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}"))
            throw new IllegalArgumentException("rssbNumber must be 8 digits");
        this.rssbNumber = rssbNumber;
    }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !Pattern.matches("^[\\w-.]+@[\\w-]+\\.[A-Za-z]{2,}$", contactEmail))
            throw new IllegalArgumentException("invalid contactEmail");
        this.contactEmail = contactEmail;
    }
}
