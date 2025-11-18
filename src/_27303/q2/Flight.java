package _27303.q2;


import java.time.LocalDateTime;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;

    public Flight(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                  String airportName, String airportCode, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination,
                  double baseFare) {
        super(id, createdDate, updatedDate, airportName, airportCode, location,
                airlineName, airlineCode, contactEmail);
        setFlightNumber(flightNumber);
        setDeparture(departure);
        setDestination(destination);
        setBaseFare(baseFare);
    }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) {
        if (flightNumber == null || flightNumber.isBlank())
            throw new IllegalArgumentException("flightNumber required");
        this.flightNumber = flightNumber;
    }

    public String getDeparture() { return departure; }
    public void setDeparture(String departure) {
        if (departure.isBlank()) throw new IllegalArgumentException("departure required");
        this.departure = departure;
    }

    public String getDestination() { return destination; }
    public void setDestination(String destination) {
        if (destination.isBlank()) throw new IllegalArgumentException("destination required");
        this.destination = destination;
    }

    public double getBaseFare() { return baseFare; }
    public void setBaseFare(double baseFare) {
        if (baseFare <= 0) throw new IllegalArgumentException("baseFare must be > 0");
        this.baseFare = baseFare;
    }
}
