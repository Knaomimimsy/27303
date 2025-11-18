package _27303.q1;

import java.time.LocalDateTime;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode; // alphanumeric, >= 3 chars

    public Category(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);
        setCategoryName(categoryName);
        setCategoryCode(categoryCode);
    }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) {
        if (categoryName == null || categoryName.trim().isEmpty()) throw new IllegalArgumentException("categoryName required");
        this.categoryName = categoryName.trim();
    }

    public String getCategoryCode() { return categoryCode; }
    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || !categoryCode.matches("[A-Za-z0-9]{3,}"))
            throw new IllegalArgumentException("categoryCode must be alphanumeric and at least 3 chars");
        this.categoryCode = categoryCode;
    }

    @Override
    public String toString() {
        return "Category{" + getCategoryName() + "," + getCategoryCode() + "}";
    }
}
