package AirporManagemet;

import AirPort.AbstractAircraft;

public class AirportManagement implements Management {
   private Flight[] flights;

    public AirportManagement(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public void addFlight( String departureTime, String arrivalTime, AbstractAircraft abstractAircraft, String status) {

            for (int i = 0; i < flights.length; i++) {
                if (flights[i] == null) {
                    System.out.println(flights);
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

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }
}
