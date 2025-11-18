package _27303.q2;

import java.time.LocalDateTime;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;

    public CabinCrew(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String airportName, String airportCode, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination,
                     double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, airportCode, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears);
        setCrewName(crewName);
        setRole(role);
        setShift(shift);
    }

    public String getCrewName() { return crewName; }
    public void setCrewName(String crewName) {
        if (crewName.isBlank()) throw new IllegalArgumentException("crewName required");
        this.crewName = crewName;
    }

    public String getRole() { return role; }
    public void setRole(String role) {
        if (role.isBlank()) throw new IllegalArgumentException("role required");
        this.role = role;
    }

    public String getShift() { return shift; }
    public void setShift(String shift) {
        if (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))
            throw new IllegalArgumentException("shift must be Day or Night");
        this.shift = shift;
    }
}
