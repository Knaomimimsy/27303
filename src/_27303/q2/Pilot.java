package _27303.q2;


import java.time.LocalDateTime;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                 String airportName, String airportCode, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination,
                 double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, airportCode, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare);
        setPilotName(pilotName);
        setLicenseNumber(licenseNumber);
        setExperienceYears(experienceYears);
    }

    public String getPilotName() { return pilotName; }
    public void setPilotName(String pilotName) {
        if (pilotName.isBlank()) throw new IllegalArgumentException("pilotName required");
        this.pilotName = pilotName;
    }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber.isBlank()) throw new IllegalArgumentException("licenseNumber required");
        this.licenseNumber = licenseNumber;
    }

    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 2) throw new IllegalArgumentException("Pilot must have ≥ 2 years experience");
        this.experienceYears = experienceYears;
    }
}
