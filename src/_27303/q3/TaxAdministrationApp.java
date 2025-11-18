package _27303.q3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;



public class TaxAdministrationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tax Administration System (Demo) ===");

        try {
            System.out.print("Authority name: ");
            String authorityName = sc.nextLine().trim();

            System.out.print("Region: ");
            String region = sc.nextLine().trim();

            System.out.print("Authority contact email: ");
            String authorityEmail = sc.nextLine().trim();

            System.out.print("Tax category name: ");
            String catName = sc.nextLine().trim();

            System.out.print("Tax code (>=3 chars): ");
            String code = sc.nextLine().trim();

            System.out.print("Tax rate (in percent, e.g., enter 15 for 15%): ");
            double ratePercent = Double.parseDouble(sc.nextLine().trim());
            double rate = ratePercent / 100.0;

            System.out.print("Taxpayer name: ");
            String tName = sc.nextLine().trim();

            System.out.print("Taxpayer TIN (9 digits): ");
            String tin = sc.nextLine().trim();

            System.out.print("Taxpayer address: ");
            String address = sc.nextLine().trim();

            System.out.print("Employer name: ");
            String employerName = sc.nextLine().trim();

            System.out.print("Employer TIN (9 digits): ");
            String employerTIN = sc.nextLine().trim();

            System.out.print("Employer contact (10 digits): ");
            String employerContact = sc.nextLine().trim();

            System.out.print("Employee name: ");
            String employeeName = sc.nextLine().trim();

            System.out.print("Employee salary: ");
            double salary = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Employee TIN (9 digits): ");
            String employeeTIN = sc.nextLine().trim();

            System.out.print("Declaration month (YYYY-MM): ");
            String declarationMonth = sc.nextLine().trim();

            System.out.print("Total income declared: ");
            double totalIncome = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Assessed tax amount (if known, else enter 0): ");
            double assessedTax = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Payment amount (if any, else enter 0): ");
            double paymentAmount = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Credits to apply : ");
            double credits = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Receipt number for record: ");
            String receiptNo = sc.nextLine().trim();

            // Create TaxRecord object (this constructs entire inheritance chain)
            TaxRecord record = new TaxRecord(
                    1, LocalDateTime.now(), LocalDateTime.now(),
                    authorityName, region, authorityEmail,
                    catName, rate, code,
                    tin, tName, address,
                    employerName, employerTIN, employerContact,
                    employeeName, salary, employeeTIN,
                    declarationMonth, totalIncome,
                    LocalDate.now(), assessedTax,
                    LocalDate.now(), paymentAmount,
                    receiptNo, credits
            );

            // compute tax
            double payable = record.computeTax();

            // Display everything
            System.out.println("\nAll entered data:");
            System.out.println("Authority: " + authorityName + " (" + authorityEmail + ")");
            System.out.println("Category: " + catName + " code=" + code + " rate=" + rate);
            System.out.println("Taxpayer: " + tName + " TIN=" + tin);
            System.out.println("Employer: " + employerName + " TIN=" + employerTIN + " contact=" + employerContact);
            System.out.println("Employee: " + employeeName + " TIN=" + employeeTIN + " salary=" + salary);
            System.out.println("Declaration month: " + declarationMonth + " declared income=" + totalIncome);
            System.out.println("Assessed tax: " + assessedTax);
            System.out.println("Payment amount recorded: " + paymentAmount);
            System.out.println("Credits applied: " + credits);

            System.out.println("\nComputed tax payable: " + payable);


            System.out.println("\n" + record.generateRecordSummary()+ "\nID: 27303");

        } catch (TaxDataException tde) {
            System.out.println("Data validation error: " + tde.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input: " + nfe.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
