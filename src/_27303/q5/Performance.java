package _27303.q5;

public class Performance extends LeaveRequest {
    private double examScore;

    public Performance(int id, String schoolName, String location,
                       String teacherName, String subject,
                       String studentName, int age, String classLevel,
                       String courseName, String courseCode,
                       String enrollmentId, String semester,
                       int totalDays, int presentDays,
                       int leaveDays, String reason,
                       double examScore) {

        super(id, schoolName, location, teacherName, subject,
                studentName, age, classLevel,
                courseName, courseCode, enrollmentId, semester,
                totalDays, presentDays, leaveDays, reason);

        setExamScore(examScore);
    }

    public double getExamScore() { return examScore; }
    public void setExamScore(double examScore) {
        if (examScore < 0 || examScore > 100)
            throw new IllegalArgumentException("Score must be 0-100");
        this.examScore = examScore;
    }
}
