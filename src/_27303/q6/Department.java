package _27303.q6;

import java.time.LocalDateTime;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        setDeptName(deptName);
        setDeptCode(deptCode);
        setManagerName(managerName);
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) {
        if (deptName == null || deptName.isBlank()) throw new IllegalArgumentException("deptName required");
        this.deptName = deptName;
    }

    public String getDeptCode() { return deptCode; }
    public void setDeptCode(String deptCode) {
        if (deptCode == null || deptCode.length() < 3) throw new IllegalArgumentException("deptCode must be >= 3 chars");
        this.deptCode = deptCode;
    }

    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) {
        if (managerName == null || managerName.isBlank()) throw new IllegalArgumentException("managerName required");
        this.managerName = managerName;
    }
}
