package _27303.q6;

import java.time.LocalDateTime;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
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
                rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
    }

    public double computeGrossSalary() {
        grossSalary = getBasicPay() + getTransportAllowance() + getHousingAllowance() + overtimePay() + getBonus();
        return grossSalary;
    }

    public double computeRssb() {
        // RSSB = 5% of basic pay (assignment)
        double rssb = getBasicPay() * 0.05;
        setRssbContribution(rssb);
        return rssb;
    }

    public double computePaye() {
        // Simple progressive tax:
        double gross = computeGrossSalary();
        double paye = 0.0;
        // Using gross for PAYE base (can be changed to taxable income rules)
        if (gross <= 300_000) {
            paye = 0.0;
        } else if (gross <= 700_000) {
            paye = (gross - 300_000) * 0.20;
        } else {
            paye = (400_000) * 0.20 + (gross - 700_000) * 0.30;
        }
        setPayeTax(paye);
        return paye;
    }

    public double computeTotalDeductions() {
        double rssb = computeRssb();
        double paye = computePaye();
        double loan = getLoanDeduction();
        totalDeductions = rssb + paye + loan;
        this.totalDeductions = totalDeductions;
        return totalDeductions;
    }

    public double computeNetSalary() {
        double gross = computeGrossSalary();
        double deductions = computeTotalDeductions();
        netSalary = gross - deductions;
        this.netSalary = netSalary;
        return netSalary;
    }

    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }
}
