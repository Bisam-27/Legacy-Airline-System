package company.airline;
public class Ticket {
    public String ticketId;
    public Flight flight;
    public Passenger passenger;
    public String seatNumber;
    public double basePrice;

    public Ticket(String ticketId, Flight flight, Passenger passenger, String seatNumber, double basePrice) {
        this.ticketId = ticketId;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.basePrice = basePrice;
    }
}
