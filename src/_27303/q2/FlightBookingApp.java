package _27303.q2;


import java.time.LocalDateTime;
import java.util.Scanner;

public class FlightBookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Flight Booking System ===");

        System.out.print("Passenger name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Gender (Male/Female/Other): ");
        String gender = sc.nextLine();

        System.out.print("Contact: ");
        String contact = sc.nextLine();

        System.out.print("Seat Number: ");
        String seat = sc.nextLine();

        System.out.print("Travel Class (Economy/Business/First): ");
        String tclass = sc.nextLine();

        Ticket ticket = new Ticket(
                1, LocalDateTime.now(), LocalDateTime.now(),
                "Kigali International", "KGL", "Kigali",
                "RwandaAir", "RWA", "info@rwa.com",
                "WB202", "Kigali", "Nairobi",
                200.0,   // base fare
                "Capt. Niyomugabo", "LN5543", 10,
                "Alice", "Cabin", "Day",
                name, age, gender, contact,
                LocalDateTime.now(), seat, tclass,
                LocalDateTime.now(), "Credit Card", 200,
                "TK12345", LocalDateTime.now()
        );

        System.out.println("\n" + ticket.generateTicketDetails()+ "\nID: 27303");
    }
}
