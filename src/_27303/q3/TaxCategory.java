package _27303.q3;

import java.time.LocalDateTime;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate; // percentage (e.g., 0.15 for 15%)
    private String code;

    public TaxCategory(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email);
        setCategoryName(categoryName);
        setRate(rate);
        setCode(code);
    }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) throws TaxDataException {
        if (categoryName == null || categoryName.trim().isEmpty()) throw new TaxDataException("categoryName required");
        this.categoryName = categoryName;
    }

    public double getRate() { return rate; }
    public void setRate(double rate) throws TaxDataException {
        if (rate <= 0) throw new TaxDataException("rate must be > 0");
        this.rate = rate;
    }

    public String getCode() { return code; }
    public void setCode(String code) throws TaxDataException {
        if (code == null || code.trim().length() < 3) throw new TaxDataException("code must be >= 3 chars");
        this.code = code;
    }

    @Override
    public String toString() {
        return "TaxCategory{" + categoryName + " code=" + code + " rate=" + rate + "}";
    }
}
