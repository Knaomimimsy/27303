package _27303.q3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TaxDeclaration extends Employee {
    private String declarationMonth; // e.g., "2025-11"
    private double totalIncome; // >=0

    public TaxDeclaration(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                          String authorityName, String region, String email,
                          String categoryName, double rate, String code,
                          String tin, String taxpayerName, String address,
                          String employerName, String employerTIN, String contact,
                          String employeeName, double salary, String employeeTIN,
                          String declarationMonth, double totalIncome) throws TaxDataException {
        super(id, createdDate, updatedDate,
                authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact,
                employeeName, salary, employeeTIN);
        setDeclarationMonth(declarationMonth);
        setTotalIncome(totalIncome);
    }

    public String getDeclarationMonth() { return declarationMonth; }
    public void setDeclarationMonth(String declarationMonth) throws TaxDataException {
        if (declarationMonth == null || declarationMonth.trim().isEmpty()) throw new TaxDataException("declarationMonth required");
        this.declarationMonth = declarationMonth;
    }

    public double getTotalIncome() { return totalIncome; }
    public void setTotalIncome(double totalIncome) throws TaxDataException {
        if (totalIncome < 0) throw new TaxDataException("totalIncome must be >= 0");
        this.totalIncome = totalIncome;
    }

    @Override
    public String toString() {
        return "TaxDeclaration{month=" + declarationMonth + ", totalIncome=" + totalIncome + ", employee=" + getEmployeeName() + "}";
    }
}
