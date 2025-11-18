package _27303.q3;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Taxpayer extends TaxCategory {
    private String tin; // 9 digits
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);
        setTin(tin);
        setTaxpayerName(taxpayerName);
        setAddress(address);
    }

    public String getTin() { return tin; }
    public void setTin(String tin) throws TaxDataException {
        if (tin == null || !Pattern.matches("\\d{9}", tin)) throw new TaxDataException("TIN must be 9 digits");
        this.tin = tin;
    }

    public String getTaxpayerName() { return taxpayerName; }
    public void setTaxpayerName(String taxpayerName) throws TaxDataException {
        if (taxpayerName == null || taxpayerName.trim().isEmpty()) throw new TaxDataException("taxpayerName required");
        this.taxpayerName = taxpayerName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws TaxDataException {
        if (address == null || address.trim().isEmpty()) throw new TaxDataException("address required");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Taxpayer{" + taxpayerName + ", TIN=" + tin + ", address=" + address + "}";
    }
}
