package _27303.q5;

public class LeaveRequest extends Attendance {
    private int leaveDays;
    private String reason;

    public LeaveRequest(int id, String schoolName, String location,
                        String teacherName, String subject,
                        String studentName, int age, String classLevel,
                        String courseName, String courseCode,
                        String enrollmentId, String semester,
                        int totalDays, int presentDays,
                        int leaveDays, String reason) {

        super(id, schoolName, location, teacherName, subject,
                studentName, age, classLevel,
                courseName, courseCode, enrollmentId, semester,
                totalDays, presentDays);

        setLeaveDays(leaveDays);
        setReason(reason);
    }

    public int getLeaveDays() { return leaveDays; }
    public void setLeaveDays(int leaveDays) {
        if (leaveDays < 0) throw new IllegalArgumentException("Invalid leave days");
        this.leaveDays = leaveDays;
    }

    public String getReason() { return reason; }
    public void setReason(String reason) {
        if (reason == null) reason = "";
        this.reason = reason;
    }
}
