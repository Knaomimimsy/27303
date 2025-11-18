package _27303.q5;

public final class AttendanceReport extends Performance {

    private String reportMonth;

    public AttendanceReport(int id, String schoolName, String location,
                            String teacherName, String subject,
                            String studentName, int age, String classLevel,
                            String courseName, String courseCode,
                            String enrollmentId, String semester,
                            int totalDays, int presentDays,
                            int leaveDays, String reason,
                            double examScore,
                            String reportMonth) {

        super(id, schoolName, location, teacherName, subject,
                studentName, age, classLevel,
                courseName, courseCode, enrollmentId, semester,
                totalDays, presentDays, leaveDays, reason,
                examScore);

        setReportMonth(reportMonth);
    }

    public String getReportMonth() { return reportMonth; }
    public void setReportMonth(String reportMonth) {
        if (reportMonth == null || reportMonth.isBlank())
            throw new IllegalArgumentException("reportMonth required");
        this.reportMonth = reportMonth;
    }

    public double calculateMonthlyAttendance() {
        return (double) getPresentDays() / getTotalDays() * 100.0;
    }

    public String generateReport() {
        return """
                === ATTENDANCE REPORT ===
                Student: %s
                Course: %s
                Month: %s
                Present: %d / %d
                Attendance: %.2f%%
                Exam Score: %.1f
                """.formatted(
                getStudentName(), getCourseName(), reportMonth,
                getPresentDays(), getTotalDays(),
                calculateMonthlyAttendance(),
                getExamScore()
        );
    }
}
