package _27303.q6;

import java.time.LocalDateTime;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private LocalDateTime issueDate;

    public Payslip(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, java.time.LocalDate startDate, java.time.LocalDate endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, LocalDateTime issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        setPayslipNumber(payslipNumber);
        setIssueDate(issueDate);
    }

    public String getPayslipNumber() { return payslipNumber; }
    public void setPayslipNumber(String payslipNumber) {
        if (payslipNumber == null || payslipNumber.isBlank()) throw new IllegalArgumentException("payslipNumber required");
        this.payslipNumber = payslipNumber;
    }

    public LocalDateTime getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDateTime issueDate) {
        if (issueDate == null) throw new IllegalArgumentException("issueDate required");
        this.issueDate = issueDate;
    }

    /**
     * Computes RSSB, PAYE and net salary and returns a formatted payslip string.
     */
    public String generatePayslip() {
        double gross = computeGrossSalary();
        double rssb = computeRssb();
        double paye = computePaye();
        double loan = getLoanDeduction();
        double totalDed = computeTotalDeductions();
        double net = computeNetSalary();

        return """
               ===== PAYSLIP =====
               Payslip No: %s
               Issue Date: %s

               Organization: %s (Code: %s)
               Department: %s (Manager: %s)
               
               Employee: %s (ID: %d)
               Position: %s
               
               -- Earnings --
               Basic Pay: %.2f
               Transport Allowance: %.2f
               Housing Allowance: %.2f
               Overtime (%.2f hrs @ %.2f): %.2f
               Bonus: %.2f
               Gross Salary: %.2f

               -- Deductions --
               RSSB (5%% of basic): %.2f
               PAYE: %.2f
               Loan Deduction: %.2f
               Total Deductions: %.2f

               Net Salary: %.2f
               ====================
               """.formatted(
                payslipNumber, issueDate,
                getOrgName(), getOrgCode(),
                getDeptName(), getManagerName(),
                getFullName(), getEmployeeID(),
                getPosition(),
                getBasicPay(), getTransportAllowance(), getHousingAllowance(),
                getOvertimeHours(), getOvertimeRate(), getOvertimeHours() * getOvertimeRate(),
                getBonus(),
                gross,
                rssb, paye, loan, totalDed,
                net
        );
    }
}
