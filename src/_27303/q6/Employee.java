package _27303.q6;

import java.time.LocalDateTime;

public class Employee extends Department {
    private int employeeID; // >=1000
    private String fullName;
    private String position;
    private double baseSalary; // >0
    private boolean rssbRegistered;

    public Employee(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        setEmployeeID(employeeID);
        setFullName(fullName);
        setPosition(position);
        setBaseSalary(baseSalary);
        setRssbRegistered(rssbRegistered);
    }

    public int getEmployeeID() { return employeeID; }
    public void setEmployeeID(int employeeID) {
        if (employeeID < 1000) throw new IllegalArgumentException("employeeID must be >= 1000");
        this.employeeID = employeeID;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) {
        if (fullName == null || fullName.isBlank()) throw new IllegalArgumentException("fullName required");
        this.fullName = fullName;
    }

    public String getPosition() { return position; }
    public void setPosition(String position) {
        if (position == null || position.isBlank()) throw new IllegalArgumentException("position required");
        this.position = position;
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("baseSalary must be > 0");
        this.baseSalary = baseSalary;
    }

    public boolean isRssbRegistered() { return rssbRegistered; }
    public void setRssbRegistered(boolean rssbRegistered) {
        this.rssbRegistered = rssbRegistered;
    }
}
