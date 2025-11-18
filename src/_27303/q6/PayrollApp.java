package _27303.q6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Payroll Management System (RSSB) ===");

        try {
            System.out.print("Organization name: ");
            String org = sc.nextLine().trim();

            System.out.print("Org code (>=3 chars): ");
            String orgCode = sc.nextLine().trim();

            System.out.print("RSSB Number (8 digits): ");
            String rssb = sc.nextLine().trim();

            System.out.print("Contact email: ");
            String email = sc.nextLine().trim();

            System.out.print("Department name: ");
            String dept = sc.nextLine().trim();

            System.out.print("Department code: ");
            String dcode = sc.nextLine().trim();

            System.out.print("Manager name: ");
            String manager = sc.nextLine().trim();

            System.out.print("Employee ID (>=1000): ");
            int empId = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Full name: ");
            String name = sc.nextLine().trim();

            System.out.print("Position: ");
            String position = sc.nextLine().trim();

            System.out.print("Base salary: ");
            double baseSalary = Double.parseDouble(sc.nextLine().trim());

            System.out.print("RSSB registered? (true/false): ");
            boolean registered = Boolean.parseBoolean(sc.nextLine().trim());

            System.out.print("Payroll month (1-12): ");
            int month = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Payroll year (>=2000): ");
            int year = Integer.parseInt(sc.nextLine().trim());

            // For simplicity we use startDate = 1st of month, endDate = last day approximated
            LocalDate startDate = LocalDate.of(year, month, 1);
            LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

            System.out.print("Basic pay (>=0, often same as base salary): ");
            double basicPay = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Transport allowance: ");
            double transport = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Housing allowance: ");
            double housing = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Loan deduction (monthly): ");
            double loan = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Overtime hours: ");
            double otHours = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Overtime rate per hour: ");
            double otRate = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Bonus: ");
            double bonus = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Payslip number: ");
            String payslipNo = sc.nextLine().trim();

            Payslip payslip = new Payslip(
                    1, LocalDateTime.now(), LocalDateTime.now(),
                    org, orgCode, rssb, email,
                    dept, dcode, manager,
                    empId, name, position, baseSalary, registered,
                    month, year, startDate, endDate,
                    basicPay, transport, housing,
                    0.0, 0.0, loan, // rssb,paye initial placeholders
                    otHours, otRate, bonus,
                    payslipNo, LocalDateTime.now()
            );

            System.out.println("\n--- All entered data ---");
            System.out.println("Organization: " + org + " (" + orgCode + "), RSSB: " + rssb);
            System.out.println("Department: " + dept + " (Manager: " + manager + ")");
            System.out.println("Employee: " + name + " ID: " + empId + " Position: " + position);
            System.out.println("Basic Pay: " + basicPay + " Transport: " + transport + " Housing: " + housing);
            System.out.println("Overtime: " + otHours + " hrs @ " + otRate + " Bonus: " + bonus);
            System.out.println("Loan deduction: " + loan);
            System.out.println();

            System.out.println(payslip.generatePayslip() + "\nStudent ID: 27303");

        } catch (IllegalArgumentException iae) {
            System.out.println("Validation error: " + iae.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
