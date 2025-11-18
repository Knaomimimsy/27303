package _27303.q3;

import java.time.LocalDate;

public class TaxAssessment extends TaxDeclaration {
    private LocalDate assessmentDate;
    private double assessedTax; // >=0

    public TaxAssessment(int id, java.time.LocalDateTime createdDate, java.time.LocalDateTime updatedDate,
                         String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeTIN,
                         String declarationMonth, double totalIncome,
                         LocalDate assessmentDate, double assessedTax) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                declarationMonth, totalIncome);
        setAssessmentDate(assessmentDate);
        setAssessedTax(assessedTax);
    }

    public LocalDate getAssessmentDate() { return assessmentDate; }
    public void setAssessmentDate(LocalDate assessmentDate) throws TaxDataException {
        if (assessmentDate == null) throw new TaxDataException("assessmentDate required");
        this.assessmentDate = assessmentDate;
    }

    public double getAssessedTax() { return assessedTax; }
    public void setAssessedTax(double assessedTax) throws TaxDataException {
        if (assessedTax < 0) throw new TaxDataException("assessedTax must be >= 0");
        this.assessedTax = assessedTax;
    }

    @Override
    public String toString() {
        return "TaxAssessment{date=" + assessmentDate + ", assessedTax=" + assessedTax + "}";
    }
}
