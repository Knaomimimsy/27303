package _27303.q3;

import java.time.LocalDateTime;
import java.util.Objects;

public class Entity {
    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public Entity(int id, LocalDateTime createdDate, LocalDateTime updatedDate) throws TaxDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws TaxDataException {
        if (id <= 0) throw new TaxDataException("ID must be > 0");
        this.id = id;
    }

    public LocalDateTime getCreatedDate() { return createdDate; }
    public void setCreatedDate(LocalDateTime createdDate) throws TaxDataException {
        this.createdDate = Objects.requireNonNull(createdDate, "createdDate cannot be null");
    }

    public LocalDateTime getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(LocalDateTime updatedDate) throws TaxDataException {
        this.updatedDate = Objects.requireNonNull(updatedDate, "updatedDate cannot be null");
    }

    @Override
    public String toString() {
        return "Entity{id=" + id + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + '}';
    }
}
