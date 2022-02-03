package AirporManagemet;

import AirPort.AbstractAircraft;

public class AirportManagement implements Management {
   private Flight[] flights;
   Tickets[] tickets;

    public AirportManagement(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public void addFlight( String departureTime, String arrivalTime, AbstractAircraft abstractAircraft, String status) {

            for (int i = 0; i < flights.length; i++) {
                if (flights[i] == null) {
                    flights[i] = new Flight();
                    System.out.println(flights[i]);
                    return;
                }
            }
        }




    @Override
    public void buyTicketOfNumberFlight() {

    }

    @Override
    public void showAllFlight() {

    }

    @Override
    public void report() {

    }

    @Override
    public void searchFlightByTicketNumber() {

    }

    public AirportManagement(Tickets[] tickets) {
        this.tickets = tickets;
    }

    @Override
    public void removeTicket(Tickets[] tickets, int numberOfFlight) {

        for (int  i = 0; i < tickets.length; i++) {
                    if (tickets[i] == null) {


                    }
                        System.out.println("Your ticket has been found " + tickets[i]);
                        return;

            }
        }



    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }
}
