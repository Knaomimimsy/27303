package _27303.q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StockManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Stock Management demo!");


        StockReport report = new StockReport();

        // interactive product input
        System.out.print("How many distinct products to add? ");
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine().trim());
            if (n < 0) n = 0;
        } catch (Exception e) {
            System.out.println("Invalid input, defaulting to 0.");
            n = 0;
        }

        for (int i = 0; i < n; i++) {
            try {
                System.out.printf("Product #%d name: ", i + 1);
                String pname = scanner.nextLine().trim();

                System.out.print("Unit price (>0): ");
                double price = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Stock limit (>=0): ");
                int limit = Integer.parseInt(scanner.nextLine().trim());

                System.out.print("Quantity available (>=0): ");
                int qty = Integer.parseInt(scanner.nextLine().trim());

                System.out.print("Reorder level (>=0): ");
                int reorder = Integer.parseInt(scanner.nextLine().trim());

                StockItem si = new StockItem(
                        100 + i, LocalDateTime.now(), LocalDateTime.now(),
                        report.getWarehouseName(), report.getLocation(), report.getContactNumber(),
                        report.getCategoryName(), report.getCategoryCode(),
                        report.getSupplierName(), report.getSupplierEmail(), report.getSupplierPhone(),
                        pname, price, limit, qty, reorder
                );
                report.addStockItem(si);

                // Optionally make a purchase
                System.out.print("Do you want to record a purchase for this product? (y/n): ");
                if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
                    System.out.print("Purchased quantity (>0): ");
                    int pqty = Integer.parseInt(scanner.nextLine().trim());
                    Purchase p = new Purchase(
                            200 + i, LocalDateTime.now(), LocalDateTime.now(),
                            report.getWarehouseName(), report.getLocation(), report.getContactNumber(),
                            report.getCategoryName(), report.getCategoryCode(),
                            report.getSupplierName(), report.getSupplierEmail(), report.getSupplierPhone(),
                            pname, price, limit, qty, reorder,
                            LocalDate.now(), pqty, report.getSupplierName()
                    );
                    report.addPurchase(p);
                }


                System.out.print("Do you want to record a sale for this product? (y/n): ");
                if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
                    System.out.print("Sold quantity (>0): ");
                    int sqty = Integer.parseInt(scanner.nextLine().trim());
                    Sale s = new Sale(
                            300 + i, LocalDateTime.now(), LocalDateTime.now(),
                            report.getWarehouseName(), report.getLocation(), report.getContactNumber(),
                            report.getCategoryName(), report.getCategoryCode(),
                            report.getSupplierName(), report.getSupplierEmail(), report.getSupplierPhone(),
                            pname, price, limit, qty, reorder,
                            LocalDate.now(), 1, report.getSupplierName(), // purchasedQuantity must be >0 for constructor chain
                            LocalDate.now(), sqty, "Buyer"
                    );
                    report.addSale(s);
                }

            } catch (Exception ex) {
                System.out.println("Error adding product: " + ex.getMessage());
                i--;
            }
        }

        System.out.println("\nGenerating report...\n");
        System.out.println(report.generateReport() + "\nID: 27303");

        scanner.close();
    }
}
