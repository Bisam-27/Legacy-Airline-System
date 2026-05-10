package company.airline;
public class Aircraft {
    public String tailNumber;
    public String model;
    public int economySeats;
    public int businessSeats;

    public Aircraft(String tailNumber, String model, int economySeats, int businessSeats) {
        this.tailNumber = tailNumber;
        this.model = model;
        this.economySeats = economySeats;
        this.businessSeats = businessSeats;
    }
}
