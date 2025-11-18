package _27303.q5;

import java.util.Scanner;

public class AttendanceApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Attendance Management System ===");

        System.out.print("School name: ");
        String school = sc.nextLine();

        System.out.print("Location: ");
        String loc = sc.nextLine();

        System.out.print("Teacher name: ");
        String tname = sc.nextLine();

        System.out.print("Subject: ");
        String sub = sc.nextLine();

        System.out.print("Student name: ");
        String sname = sc.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Class Level: ");
        String level = sc.nextLine();

        System.out.print("Course name: ");
        String cname = sc.nextLine();

        System.out.print("Course code: ");
        String ccode = sc.nextLine();

        System.out.print("Enrollment ID: ");
        String eid = sc.nextLine();

        System.out.print("Semester: ");
        String sem = sc.nextLine();

        System.out.print("Total Days: ");
        int days = Integer.parseInt(sc.nextLine());

        System.out.print("Present Days: ");
        int present = Integer.parseInt(sc.nextLine());

        System.out.print("Leave Days: ");
        int leave = Integer.parseInt(sc.nextLine());

        System.out.print("Leave Reason: ");
        String reason = sc.nextLine();

        System.out.print("Exam Score: ");
        double score = Double.parseDouble(sc.nextLine());

        System.out.print("Report Month: ");
        String month = sc.nextLine();

        AttendanceReport report = new AttendanceReport(
                1, school, loc,
                tname, sub,
                sname, age, level,
                cname, ccode,
                eid, sem,
                days, present, leave, reason,
                score, month
        );

        System.out.println(report.generateReport() + "\nID: 27303");
    }
}
