package _27303.q6;

import java.time.LocalDateTime;
import java.util.Objects;

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
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        this.id = id;
    }

    public LocalDateTime getCreatedDate() { return createdDate; }
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = Objects.requireNonNull(createdDate, "createdDate cannot be null");
    }

    public LocalDateTime getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = Objects.requireNonNull(updatedDate, "updatedDate cannot be null");
    }
}
