package _27303.q1;

import java.time.LocalDateTime;
import java.time.LocalDate;

public final class StockReport extends Inventory {
    private LocalDateTime reportDate;
    private String remarks;

    public StockReport(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                       String warehouseName, String location, String contactNumber,
                       String categoryName, String categoryCode,
                       String supplierName, String supplierEmail, String supplierPhone,
                       String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       LocalDate purchaseDate, int purchasedQuantity, String supplierNameOverridden,
                       LocalDate saleDate, int soldQuantity, String customerName,
                       LocalDateTime reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, supplierNameOverridden,
                saleDate, soldQuantity, customerName);
        setReportDate(reportDate);
        setRemarks(remarks);
    }

    // convenience constructor
    public StockReport() {
        this(1, LocalDateTime.now(), LocalDateTime.now(),
                "Main Warehouse", "Kigali", "0788000000",
                "Electronics", "ELC",
                "ACME Supplies", "acme@example.com", "0788001111",
                "DefaultProduct", 10.0, 100,
                0, 10,
                LocalDate.now(), 1, "ACME Supplies",
                LocalDate.now(), 1, "Customer",
                LocalDateTime.now(), "Initial report");
    }

    public LocalDateTime getReportDate() { return reportDate; }
    public void setReportDate(LocalDateTime reportDate) {
        if (reportDate == null) throw new IllegalArgumentException("reportDate cannot be null");
        this.reportDate = reportDate;
    }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) {
        this.remarks = (remarks == null) ? "" : remarks;
    }

    /**
     * Summarizes total stock and sales.
     */
    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Stock Report ===\n");
        sb.append("Report Date: ").append(reportDate).append("\n");
        sb.append("Total different items: ").append(getStockItems().size()).append("\n");
        sb.append("Total quantity in stock: ").append(totalItemsCount()).append("\n");
        sb.append(String.format("Total stock value: %.2f\n", totalStockValue()));
        sb.append("Total sold quantity: ").append(totalSoldQuantity()).append("\n");
        sb.append("Remarks: ").append(remarks).append("\n");
        sb.append("\n-- Items detail --\n");
        for (StockItem si : getStockItems()) {
            sb.append(si.toString()).append(", value=").append(si.getQuantityAvailable() * si.getUnitPrice()).append("\n");
        }
        return sb.toString();
    }
}
