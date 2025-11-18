package _27303.q2;


import java.time.LocalDateTime;

public class Payment extends Booking {
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String airportName, String airportCode, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination,
                   double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   LocalDateTime bookingDate, String seatNumber, String travelClass,
                   LocalDateTime paymentDate, String paymentMethod, double amountPaid) {

        super(id, createdDate, updatedDate, airportName, airportCode, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination,
                baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass);

        setPaymentDate(paymentDate);
        setPaymentMethod(paymentMethod);
        setAmountPaid(amountPaid);
    }

    public LocalDateTime getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDateTime paymentDate) {
        if (paymentDate == null) throw new IllegalArgumentException("paymentDate required");
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod.isBlank()) throw new IllegalArgumentException("paymentMethod required");
        this.paymentMethod = paymentMethod;
    }

    public double getAmountPaid() { return amountPaid; }
    public void setAmountPaid(double amountPaid) {
        if (amountPaid <= 0) throw new IllegalArgumentException("amountPaid must be > 0");
        this.amountPaid = amountPaid;
    }
}
