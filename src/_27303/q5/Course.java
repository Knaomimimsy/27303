package _27303.q5;

public class Course extends Student {
    private String courseName;
    private String courseCode;

    public Course(int id, String schoolName, String location,
                  String teacherName, String subject,
                  String studentName, int age, String classLevel,
                  String courseName, String courseCode) {

        super(id, schoolName, location, teacherName, subject,
                studentName, age, classLevel);

        setCourseName(courseName);
        setCourseCode(courseCode);
    }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.isBlank())
            throw new IllegalArgumentException("Course name required");
        this.courseName = courseName;
    }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) {
        if (courseCode == null || courseCode.isBlank())
            throw new IllegalArgumentException("Course code required");
        this.courseCode = courseCode;
    }
}
