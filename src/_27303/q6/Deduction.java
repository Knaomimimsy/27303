package _27303.q6;

import java.time.LocalDateTime;

public class Deduction extends SalaryStructure {
    private double rssbContribution; // should be 5% of basicPay, but kept field to store computed
    private double payeTax;
    private double loanDeduction;

    public Deduction(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, java.time.LocalDate startDate, java.time.LocalDate endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double payeTax, double loanDeduction) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        setRssbContribution(rssbContribution);
        setPayeTax(payeTax);
        setLoanDeduction(loanDeduction);
    }

    public double getRssbContribution() { return rssbContribution; }
    public void setRssbContribution(double rssbContribution) {
        if (rssbContribution < 0) throw new IllegalArgumentException("rssbContribution >= 0");
        this.rssbContribution = rssbContribution;
    }

    public double getPayeTax() { return payeTax; }
    public void setPayeTax(double payeTax) {
        if (payeTax < 0) throw new IllegalArgumentException("payeTax >= 0");
        this.payeTax = payeTax;
    }

    public double getLoanDeduction() { return loanDeduction; }
    public void setLoanDeduction(double loanDeduction) {
        if (loanDeduction < 0) throw new IllegalArgumentException("loanDeduction >= 0");
        this.loanDeduction = loanDeduction;
    }
}
