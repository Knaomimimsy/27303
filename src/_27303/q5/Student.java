package _27303.q5;

public class Student extends Teacher {
    private String studentName;
    private int age;
    private String classLevel;

    public Student(int id, String schoolName, String location,
                   String teacherName, String subject,
                   String studentName, int age, String classLevel) {

        super(id, schoolName, location, teacherName, subject);
        setStudentName(studentName);
        setAge(age);
        setClassLevel(classLevel);
    }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) {
        if (studentName == null || studentName.isBlank())
            throw new IllegalArgumentException("Student name required");
        this.studentName = studentName;
    }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 5) throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    public String getClassLevel() { return classLevel; }
    public void setClassLevel(String classLevel) {
        if (classLevel == null || classLevel.isBlank())
            throw new IllegalArgumentException("Class level required");
        this.classLevel = classLevel;
    }
}
