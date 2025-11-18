package _27303.q5;

public class Enrollment extends Course {
    private String enrollmentId;
    private String semester;

    public Enrollment(int id, String schoolName, String location,
                      String teacherName, String subject,
                      String studentName, int age, String classLevel,
                      String courseName, String courseCode,
                      String enrollmentId, String semester) {

        super(id, schoolName, location, teacherName, subject,
                studentName, age, classLevel,
                courseName, courseCode);

        setEnrollmentId(enrollmentId);
        setSemester(semester);
    }

    public String getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(String enrollmentId) {
        if (enrollmentId == null || enrollmentId.isBlank())
            throw new IllegalArgumentException("Enrollment ID required");
        this.enrollmentId = enrollmentId;
    }

    public String getSemester() { return semester; }
    public void setSemester(String semester) {
        if (semester == null || semester.isBlank())
            throw new IllegalArgumentException("Semester required");
        this.semester = semester;
    }
}
