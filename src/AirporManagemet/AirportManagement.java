package AirporManagemet;

import AirPort.AbstractAircraft;

public class AirportManagement implements Management {
    Flight[] flights;

    public AirportManagement(Flight[] flights) {
        this.flights = flights;
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
