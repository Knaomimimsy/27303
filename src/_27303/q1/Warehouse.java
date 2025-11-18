package _27303.q1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber; // 10 digits required

    public Warehouse(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        setWarehouseName(warehouseName);
        setLocation(location);
        setContactNumber(contactNumber);
    }

    public String getWarehouseName() { return warehouseName; }
    public void setWarehouseName(String warehouseName) {
        if (warehouseName == null || warehouseName.trim().isEmpty()) throw new IllegalArgumentException("warehouseName required");
        this.warehouseName = warehouseName.trim();
    }

    public String getLocation() { return location; }
    public void setLocation(String location) {
        if (location == null || location.trim().isEmpty()) throw new IllegalArgumentException("location required");
        this.location = location.trim();
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new IllegalArgumentException("contactNumber must be 10 digits");
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Warehouse{" + getId() + "," + warehouseName + "," + location + "," + contactNumber + "}";
    }
}
