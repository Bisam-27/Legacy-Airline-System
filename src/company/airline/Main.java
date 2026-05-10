package company.airline;
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Legacy Airline System...");
        Aircraft a = new Aircraft("N12345", "Boeing 737", 150, 20);
        Flight f = new Flight("FL101", a, "JFK", "LHR", "2026-06-01 18:00");
        Passenger p = new Passenger("AB123456", "Alice Johnson", 35, "US", "GOLD");
        Ticket t = new Ticket("TKT-9912", f, p, "12A", 850.0);
        
        FareCalculator calc = new FareCalculator();
        double finalFare = calc.calculateFinalFare(t);
        
        System.out.println("Final fare for " + p.fullName + " is: $" + finalFare);
        // calc.generateMassiveAuditLog();
    }
}
