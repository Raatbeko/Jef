package AirporManagemet;

import AirPort.AbstractAircraft;

public class AirportManagement implements Management {
    private Flight[] flights;
    private Ticket[] tickets;

    public AirportManagement() {
    }

    public AirportManagement(Flight[] flights) {
        this.flights = flights;
    }

    public AirportManagement(Flight[] flights, Ticket[] tickets) {
        this.flights = flights;
        this.tickets = tickets;
    }

    @Override
    public void addFlight(String departureTime, String arrivalTime, AbstractAircraft abstractAircraft) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null) {
                flights[i] = new Flight(departureTime, arrivalTime, abstractAircraft);
                return;
            }
        }
    }

    @Override
    public Flight buyTicketOfNumberFlight(int numberIfFlight) {
        for (Flight flight : flights) {
            if (flight.getId() == numberIfFlight) {
               return flight;
            }
        }
        return null;
    }

    @Override
    public void showAllFlight() {
        for (Flight flight : flights) {
            if (flight != null)
                System.out.println(flight);
        }
    }

    @Override
    public void report() {
        System.out.println("Count on Flights -> " + Flight.getCount());
        System.out.println("Number of tickets sold-> " + Ticket.getCount());
    }

    @Override
    public void searchFlightByTicketNumber(int numOfTicket) {

    }

    @Override
    public String checkingForFull() {
        if (flights[flights.length - 1] != null) {
            return "Flights is full";
        }
        return "";

    }

    @Override
    public void fillOutATicket(Flight flight,
                               String whereDoesFly,
                               String departurePoint) {

        Ticket ticket = new Ticket(flight,whereDoesFly,departurePoint);
        boolean chek = true;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == null){
                tickets[i] = ticket;
                chek = false;
            }
        }
        if (!chek){
            System.out.println("You bought ticket!");
        }else{
            System.out.println("All ticket sold out!!!");
        }

    }

    @Override
    public void removeTicket(int numberOfFlight) {

    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }
}
