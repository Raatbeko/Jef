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
    public void addFlight(String departureTime, String arrivalTime, AbstractAircraft abstractAircraft, String status) {



    }

    @Override
    public void buyTicketOfNumberFlight() {

    }

    @Override
    public void showAllFlight() {

    }

    @Override
    public void report() {
        System.out.println("Count on Flights -> "+ Flight.getCount());
        System.out.println("Number of tickets sold-> "+ Tickets.getCount());
    }

    @Override
    public void searchFlightByTicketNumber(int numOfTicket) {


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
