package _27303.q4;

import java.time.LocalDateTime;

public class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        setDeptName(deptName);
        setDeptCode(deptCode);
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) {
        if (deptName == null || deptName.isBlank()) throw new IllegalArgumentException("deptName required");
        this.deptName = deptName;
    }

    public String getDeptCode() { return deptCode; }
    public void setDeptCode(String deptCode) {
        if (deptCode == null || deptCode.length() < 3)
            throw new IllegalArgumentException("deptCode must be >= 3 chars");
        this.deptCode = deptCode;
    }
}
