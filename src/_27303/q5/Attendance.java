package _27303.q5;

public class Attendance extends Enrollment {
    private int totalDays;
    private int presentDays;

    public Attendance(int id, String schoolName, String location,
                      String teacherName, String subject,
                      String studentName, int age, String classLevel,
                      String courseName, String courseCode,
                      String enrollmentId, String semester,
                      int totalDays, int presentDays) {

        super(id, schoolName, location, teacherName, subject,
                studentName, age, classLevel,
                courseName, courseCode, enrollmentId, semester);

        setTotalDays(totalDays);
        setPresentDays(presentDays);
    }

    public int getTotalDays() { return totalDays; }
    public void setTotalDays(int totalDays) {
        if (totalDays <= 0) throw new IllegalArgumentException("Total days > 0");
        this.totalDays = totalDays;
    }

    public int getPresentDays() { return presentDays; }
    public void setPresentDays(int presentDays) {
        if (presentDays < 0 || presentDays > totalDays)
            throw new IllegalArgumentException("Invalid present days");
        this.presentDays = presentDays;
    }

    public int getAbsentDays() {
        return totalDays - presentDays;
    }
}
