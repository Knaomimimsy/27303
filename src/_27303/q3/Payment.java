package _27303.q3;

import java.time.LocalDate;

public class Payment extends TaxAssessment {
    private LocalDate paymentDate;
    private double paymentAmount; // >0

    public Payment(int id, java.time.LocalDateTime createdDate, java.time.LocalDateTime updatedDate,
                   String authorityName, String region, String email,
                   String categoryName, double rate, String code,
                   String tin, String taxpayerName, String address,
                   String employerName, String employerTIN, String contact,
                   String employeeName, double salary, String employeeTIN,
                   String declarationMonth, double totalIncome,
                   java.time.LocalDate assessmentDate, double assessedTax,
                   LocalDate paymentDate, double paymentAmount) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                declarationMonth, totalIncome, assessmentDate, assessedTax);
        setPaymentDate(paymentDate);
        setPaymentAmount(paymentAmount);
    }

    public LocalDate getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDate paymentDate) throws TaxDataException {
        if (paymentDate == null) throw new TaxDataException("paymentDate required");
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) throws TaxDataException {
        if (paymentAmount <= 0) throw new TaxDataException("paymentAmount must be > 0");
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Payment{date=" + paymentDate + ", amount=" + paymentAmount + "}";
    }
}
