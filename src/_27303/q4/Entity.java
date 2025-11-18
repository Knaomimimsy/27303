package _27303.q4;

import java.time.LocalDateTime;

public class Entity {
    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public Entity(int id, LocalDateTime createdDate, LocalDateTime updatedDate) {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
        this.id = id;
    }

    public LocalDateTime getCreatedDate() { return createdDate; }
    public void setCreatedDate(LocalDateTime createdDate) {
        if (createdDate == null) throw new IllegalArgumentException("createdDate cannot be null");
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(LocalDateTime updatedDate) {
        if (updatedDate == null) throw new IllegalArgumentException("updatedDate cannot be null");
        this.updatedDate = updatedDate;
    }
}
