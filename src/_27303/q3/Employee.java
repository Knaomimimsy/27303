package _27303.q3;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Employee extends Employer {
    private String employeeName;
    private double salary; // >0
    private String employeeTIN; // valid TIN

    public Employee(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact);
        setEmployeeName(employeeName);
        setSalary(salary);
        setEmployeeTIN(employeeTIN);
    }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) throws TaxDataException {
        if (employeeName == null || employeeName.trim().isEmpty()) throw new TaxDataException("employeeName required");
        this.employeeName = employeeName;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) throws TaxDataException {
        if (salary <= 0) throw new TaxDataException("salary must be > 0");
        this.salary = salary;
    }

    public String getEmployeeTIN() { return employeeTIN; }
    public void setEmployeeTIN(String employeeTIN) throws TaxDataException {
        if (employeeTIN == null || !Pattern.matches("\\d{9}", employeeTIN)) throw new TaxDataException("employeeTIN must be 9 digits");
        this.employeeTIN = employeeTIN;
    }

    @Override
    public String toString() {
        return "Employee{" + employeeName + ", salary=" + salary + ", TIN=" + employeeTIN + "}";
    }
}
