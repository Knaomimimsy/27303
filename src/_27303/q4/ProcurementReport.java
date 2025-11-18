package _27303.q4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public final class ProcurementReport extends Invoice {

    private LocalDate reportDate;
    private String summary;
    private ArrayList<Invoice> invoiceList = new ArrayList<>();

    public ProcurementReport(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, LocalDate orderDate, double totalAmount,
                             LocalDate deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             LocalDate reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy,
                inspectorName, status, remarks,
                invoiceNo, invoiceAmount);

        setReportDate(reportDate);
        setSummary(summary);
    }

    public void addInvoice(Invoice inv) {
        invoiceList.add(inv);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Invoice inv : invoiceList) {
            sum += inv.getInvoiceAmount();
        }
        return sum;
    }

    public LocalDate getReportDate() { return reportDate; }
    public void setReportDate(LocalDate reportDate) {
        if (reportDate == null) throw new IllegalArgumentException("reportDate required");
        this.reportDate = reportDate;
    }

    public String getSummary() { return summary; }
    public void setSummary(String summary) {
        if (summary == null) summary = "";
        this.summary = summary;
    }
}
