package company.airline;
public class Passenger {
    public String passportNumber;
    public String fullName;
    public int age;
    public String nationality;
    public String frequentFlyerTier; // "NONE", "SILVER", "GOLD"

    public Passenger(String passportNumber, String fullName, int age, String nationality, String frequentFlyerTier) {
        this.passportNumber = passportNumber;
        this.fullName = fullName;
        this.age = age;
        this.nationality = nationality;
        this.frequentFlyerTier = frequentFlyerTier;
    }
}
