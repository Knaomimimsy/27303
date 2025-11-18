package _27303.q2;

import java.time.LocalDateTime;

public class Booking extends Passenger {
    private LocalDateTime bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String airportName, String airportCode, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination,
                   double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   LocalDateTime bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, airportCode, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact);

        setBookingDate(bookingDate);
        setSeatNumber(seatNumber);
        setTravelClass(travelClass);
    }

    public LocalDateTime getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDateTime bookingDate) {
        if (bookingDate == null) throw new IllegalArgumentException("bookingDate required");
        this.bookingDate = bookingDate;
    }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) {
        if (seatNumber.isBlank()) throw new IllegalArgumentException("seatNumber required");
        this.seatNumber = seatNumber;
    }

    public String getTravelClass() { return travelClass; }
    public void setTravelClass(String travelClass) {
        if (!travelClass.matches("(?i)Economy|Business|First"))
            throw new IllegalArgumentException("Class must be Economy, Business, or First");
        this.travelClass = travelClass;
    }
}
