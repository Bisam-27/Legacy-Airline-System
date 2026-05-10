package company.airline;
public class Flight {
    public String flightNumber;
    public Aircraft aircraft;
    public String origin;
    public String destination;
    public String departureTime;
    
    public Flight(String flightNumber, Aircraft aircraft, String origin, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
    }
}
