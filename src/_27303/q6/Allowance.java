package _27303.q6;

import java.time.LocalDateTime;

public class Allowance extends Deduction {
    private double overtimeHours;
    private double overtimeRate;
    private double bonus;

    public Allowance(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, java.time.LocalDate startDate, java.time.LocalDate endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double payeTax, double loanDeduction,
                     double overtimeHours, double overtimeRate, double bonus) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                rssbContribution, payeTax, loanDeduction);
        setOvertimeHours(overtimeHours);
        setOvertimeRate(overtimeRate);
        setBonus(bonus);
    }

    public double getOvertimeHours() { return overtimeHours; }
    public void setOvertimeHours(double overtimeHours) {
        if (overtimeHours < 0) throw new IllegalArgumentException("overtimeHours >= 0");
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() { return overtimeRate; }
    public void setOvertimeRate(double overtimeRate) {
        if (overtimeRate < 0) throw new IllegalArgumentException("overtimeRate >= 0");
        this.overtimeRate = overtimeRate;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) {
        if (bonus < 0) throw new IllegalArgumentException("bonus >= 0");
        this.bonus = bonus;
    }

    public double overtimePay() {
        return overtimeHours * overtimeRate;
    }
}
