package _27303.q2;

import java.time.LocalDateTime;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        setAirportName(airportName);
        setCode(code);
        setLocation(location);
    }

    public String getAirportName() { return airportName; }
    public void setAirportName(String airportName) {
        if (airportName == null || airportName.trim().isEmpty())
            throw new IllegalArgumentException("airportName required");
        this.airportName = airportName;
    }

    public String getCode() { return code; }
    public void setCode(String code) {
        if (!code.matches("[A-Z]{3}"))
            throw new IllegalArgumentException("Airport code must be 3 uppercase letters");
        this.code = code;
    }

    public String getLocation() { return location; }
    public void setLocation(String location) {
        if (location == null || location.isEmpty())
            throw new IllegalArgumentException("location required");
        this.location = location;
    }
}
