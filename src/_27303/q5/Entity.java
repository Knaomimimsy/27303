package _27303.q5;

public class Entity {
    private int id;

    public Entity(int id) {
        setId(id);
    }

    public int getId() { return id; }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
        this.id = id;
    }
}
