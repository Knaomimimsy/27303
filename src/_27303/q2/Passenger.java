package _27303.q2;

import java.time.LocalDateTime;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String airportName, String airportCode, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination,
                     double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, airportCode, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination,
                baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift);
        setPassengerName(passengerName);
        setAge(age);
        setGender(gender);
        setContact(contact);
    }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) {
        if (passengerName.isBlank()) throw new IllegalArgumentException("Name required");
        this.passengerName = passengerName;
    }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Age > 0");
        this.age = age;
    }

    public String getGender() { return gender; }
    public void setGender(String gender) {
        if (!gender.matches("(?i)male|female|other"))
            throw new IllegalArgumentException("Invalid gender");
        this.gender = gender;
    }

    public String getContact() { return contact; }
    public void setContact(String contact) {
        if (contact.length() < 5) throw new IllegalArgumentException("Invalid contact");
        this.contact = contact;
    }
}
