package _27303.q6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PayrollPeriod extends Employee {
    private int month; // 1-12
    private int year; // >=2000
    private LocalDate startDate;
    private LocalDate endDate;

    public PayrollPeriod(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                         String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, LocalDate startDate, LocalDate endDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered);
        setMonth(month);
        setYear(year);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public int getMonth() { return month; }
    public void setMonth(int month) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("month must be 1-12");
        this.month = month;
    }

    public int getYear() { return year; }
    public void setYear(int year) {
        if (year < 2000) throw new IllegalArgumentException("year must be >= 2000");
        this.year = year;
    }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) {
        if (startDate == null) throw new IllegalArgumentException("startDate cannot be null");
        this.startDate = startDate;
    }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) {
        if (endDate == null) throw new IllegalArgumentException("endDate cannot be null");
        this.endDate = endDate;
    }
}
