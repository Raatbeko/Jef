package AirporManagemet;

import AirPort.AbstractAircraft;

public class AirportManagement implements Management {
    private Flight[] flights;
    private Tickets[] tickets;

    public AirportManagement() {
    }

    public AirportManagement(Flight[] flights) {
        this.flights = flights;
    }

    public AirportManagement(Flight[] flights, Tickets[] tickets) {
        this.flights = flights;
        this.tickets = tickets;
    }

    @Override
    public void addFlight(String departureTime, String arrivalTime, AbstractAircraft abstractAircraft) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null) {
                flights[i] = new Flight(departureTime,arrivalTime,abstractAircraft);
                return;
            }
        }
    }

    @Override
    public void buyTicketOfNumberFlight(int numberIfFlight) {
        for (Flight flight : flights) {
            if (flight.getId() == numberIfFlight){
                for (Tickets ticket : tickets) {
                    if (ticket == null) {
                        ticket= new Tickets();
                    }
                }
            }
        }

    }

    @Override
    public void showAllFlight(){
        for (Flight flight : flights) {
            if (flight != null)
                System.out.println(flight);
        }
    }

    @Override
    public void report() {
        System.out.println("Count on Flights -> "+ Flight.getCount());
        System.out.println("Number of tickets sold-> "+ Tickets.getCount());
    }

    @Override
    public void searchFlightByTicketNumber(int numOfTicket) {


    }

    @Override
    public String checkingForFull() {
        if (flights[flights.length-1] != null) {
            return "Flights is full";
        }
        return "";

    }

    public Tickets[] getTickets() {
        return tickets;
    }

    public void setTickets(Tickets[] tickets) {
        this.tickets = tickets;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }
}
