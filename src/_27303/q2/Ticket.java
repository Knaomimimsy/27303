package _27303.q2;


import java.time.LocalDateTime;

public final class Ticket extends Payment {
    private String ticketNumber;
    private LocalDateTime issueDate;

    public Ticket(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                  String airportName, String airportCode, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination,
                  double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  LocalDateTime bookingDate, String seatNumber, String travelClass,
                  LocalDateTime paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, LocalDateTime issueDate) {

        super(id, createdDate, updatedDate, airportName, airportCode, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination,
                baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid);

        setTicketNumber(ticketNumber);
        setIssueDate(issueDate);
    }

    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) {
        if (ticketNumber.isBlank()) throw new IllegalArgumentException("ticketNumber required");
        this.ticketNumber = ticketNumber;
    }

    public LocalDateTime getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDateTime issueDate) {
        if (issueDate == null) throw new IllegalArgumentException("issueDate required");
        this.issueDate = issueDate;
    }

    // ✨ The required fare calculation method
    public double calculateFare() {
        double classMultiplier = switch (getTravelClass().toLowerCase()) {
            case "business" -> 1.5;
            case "first" -> 2.0;
            default -> 1.0;
        };

        double fare = getBaseFare() * classMultiplier;

        double tax = fare * 0.18;   // 18%
        double discount = 0;

        if (getTravelClass().equalsIgnoreCase("Business")) {
            discount = fare * 0.05;
        } else if (getTravelClass().equalsIgnoreCase("First")) {
            discount = fare * 0.10;
        }

        return fare + tax - discount;
    }

    public String generateTicketDetails() {
        return """
               --- Ticket Details ---
               Passenger: %s
               Flight: %s from %s to %s
               Class: %s
               Seat: %s
               Final Fare: %.2f
               """.formatted(
                getPassengerName(),
                getFlightNumber(), getDeparture(), getDestination(),
                getTravelClass(), getSeatNumber(),
                calculateFare()
        );
    }
}
