package _27303.q6;

import java.time.LocalDateTime;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;

    public SalaryStructure(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                           String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                           int month, int year, java.time.LocalDate startDate, java.time.LocalDate endDate,
                           double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate);
        setBasicPay(basicPay);
        setTransportAllowance(transportAllowance);
        setHousingAllowance(housingAllowance);
    }

    public double getBasicPay() { return basicPay; }
    public void setBasicPay(double basicPay) {
        if (basicPay < 0) throw new IllegalArgumentException("basicPay >= 0");
        this.basicPay = basicPay;
    }

    public double getTransportAllowance() { return transportAllowance; }
    public void setTransportAllowance(double transportAllowance) {
        if (transportAllowance < 0) throw new IllegalArgumentException("transportAllowance >= 0");
        this.transportAllowance = transportAllowance;
    }

    public double getHousingAllowance() { return housingAllowance; }
    public void setHousingAllowance(double housingAllowance) {
        if (housingAllowance < 0) throw new IllegalArgumentException("housingAllowance >= 0");
        this.housingAllowance = housingAllowance;
    }
}
