package _27303.q4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ProcurementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== PROCUREMENT MANAGEMENT SYSTEM ===");

        System.out.print("Organization name: ");
        String org = sc.nextLine();

        System.out.print("Address: ");
        String addr = sc.nextLine();

        System.out.print("Contact email: ");
        String email = sc.nextLine();

        System.out.print("Department Name: ");
        String dept = sc.nextLine();

        System.out.print("Department Code: ");
        String dcode = sc.nextLine();

        System.out.print("Supplier Name: ");
        String sname = sc.nextLine();

        System.out.print("Supplier TIN (9 digits): ");
        String tin = sc.nextLine();

        System.out.print("Supplier Contact (10 digits): ");
        String cont = sc.nextLine();

        System.out.print("Product Name: ");
        String pname = sc.nextLine();

        System.out.print("Unit Price: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Quantity: ");
        int qty = Integer.parseInt(sc.nextLine());

        System.out.print("PO Number: ");
        String po = sc.nextLine();

        System.out.print("Invoice Number: ");
        String invNo = sc.nextLine();

        System.out.print("Invoice Amount: ");
        double invAmt = Double.parseDouble(sc.nextLine());

        ProcurementReport r = new ProcurementReport(
                1, LocalDateTime.now(), LocalDateTime.now(),
                org, addr, email,
                dept, dcode,
                sname, tin, cont,
                pname, price, qty,
                po, LocalDate.now(), price * qty,
                LocalDate.now(), sname,
                "Inspector", "Passed", "Goods ok",
                invNo, invAmt,
                LocalDate.now(), "Initial Report"
        );

        r.addInvoice(r);

        System.out.println("\n=== INSERTED DATA ===");
        System.out.println("Organization: " + org);
        System.out.println("Address: " + addr);
        System.out.println("Department: " + dept + " (" + dcode + ")");
        System.out.println("Supplier: " + sname + " TIN=" + tin + " Contact=" + cont);
        System.out.println("Product: " + pname + " Price=" + price + " Qty=" + qty);
        System.out.println("PO: " + po + " Total PO Amount=" + (price * qty));
        System.out.println("Invoice: " + invNo + " Amount=" + invAmt);

        System.out.println("\nTotal from all invoices = " + r.calculateTotal()+ "\nID: 27303");
    }
}
