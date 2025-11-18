package _27303.q5;

public class School extends Entity {
    private String schoolName;
    private String location;

    public School(int id, String schoolName, String location) {
        super(id);
        setSchoolName(schoolName);
        setLocation(location);
    }

    public String getSchoolName() { return schoolName; }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isBlank())
            throw new IllegalArgumentException("School name required");
        this.schoolName = schoolName;
    }

    public String getLocation() { return location; }

    public void setLocation(String location) {
        if (location == null || location.isBlank())
            throw new IllegalArgumentException("Location required");
        this.location = location;
    }
}
