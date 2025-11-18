package _27303.q2;

import java.time.LocalDateTime;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        setAirlineName(airlineName);
        setAirlineCode(airlineCode);
        setContactEmail(contactEmail);
    }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) {
        if (airlineName == null || airlineName.isBlank())
            throw new IllegalArgumentException("airlineName required");
        this.airlineName = airlineName;
    }

    public String getAirlineCode() { return airlineCode; }
    public void setAirlineCode(String airlineCode) {
        if (!airlineCode.matches("[A-Za-z]{2,4}"))
            throw new IllegalArgumentException("Airline code must be 2–4 letters");
        this.airlineCode = airlineCode;
    }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) {
        if (!contactEmail.matches("^[\\w-.]+@[\\w-]+\\.[A-Za-z]{2,}$"))
            throw new IllegalArgumentException("Invalid email");
        this.contactEmail = contactEmail;
    }
}
