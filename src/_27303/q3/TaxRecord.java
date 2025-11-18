package _27303.q3;

import java.time.LocalDateTime;


public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;
    private double credits; // credits to deduct (>=0)

    public TaxRecord(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     java.time.LocalDate assessmentDate, double assessedTax,
                     java.time.LocalDate paymentDate, double paymentAmount,
                     String receiptNo, double credits) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact,
                employeeName, salary, employeeTIN,
                declarationMonth, totalIncome, assessmentDate, assessedTax,
                paymentDate, paymentAmount);
        setReceiptNo(receiptNo);
        setCredits(credits);
    }

    public String getReceiptNo() { return receiptNo; }
    public void setReceiptNo(String receiptNo) throws TaxDataException {
        if (receiptNo == null || receiptNo.trim().isEmpty()) throw new TaxDataException("receiptNo required");
        this.receiptNo = receiptNo;
    }

    public double getTotalTax() { return totalTax; }

    public double getCredits() { return credits; }
    public void setCredits(double credits) throws TaxDataException {
        if (credits < 0) throw new TaxDataException("credits must be >= 0");
        this.credits = credits;
    }

    /**
     * Compute payable tax using the final formula.
     * @return computed payable tax (not less than 0)
     */
    public double computeTax() throws TaxDataException {
        double salary = getSalary();
        double rate = getRate(); // from TaxCategory: stored in ancestor
        if (salary < 0) throw new TaxDataException("salary invalid");
        if (rate <= 0) throw new TaxDataException("rate invalid");

        double tax = (salary * rate) - credits;
        if (tax < 0) tax = 0;
        this.totalTax = tax;
        return tax;
    }

    public String generateRecordSummary() {
        return """
               --- Tax Record ---
               Taxpayer: %s (TIN: %s)
               Employer: %s (TIN: %s)
               Employee: %s
               Salary: %.2f
               Tax Category: %s (rate=%.4f)
               Credits: %.2f
               Total Tax Payable: %.2f
               Receipt No: %s
               """.formatted(
                getTaxpayerName(), getTin(),
                getEmployerName(), getEmployerTIN(),
                getEmployeeName(),
                getSalary(),
                getCategoryName(), getRate(),
                getCredits(),
                getTotalTax(),
                getReceiptNo()
        );
    }
}
