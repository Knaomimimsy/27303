package _27303.q5;

public class Teacher extends School {
    private String teacherName;
    private String subject;

    public Teacher(int id, String schoolName, String location,
                   String teacherName, String subject) {
        super(id, schoolName, location);
        setTeacherName(teacherName);
        setSubject(subject);
    }

    public String getTeacherName() { return teacherName; }
    public void setTeacherName(String teacherName) {
        if (teacherName == null || teacherName.isBlank())
            throw new IllegalArgumentException("Teacher name required");
        this.teacherName = teacherName;
    }

    public String getSubject() { return subject; }
    public void setSubject(String subject) {
        if (subject == null || subject.isBlank())
            throw new IllegalArgumentException("Subject required");
        this.subject = subject;
    }
}
