package AirporManagemet;

import AirPort.AbstractAircraft;

public interface Management {

    void addFlight(String departureTime, String arrivalTime, AbstractAircraft abstractAircraft);

    Flight buyTicketOfNumberFlight(int numberOfFlight);

    void showAllFlight();

    void report();

    void searchFlightByTicketNumber(int numOfTicket);

    String checkingForFull();

    void fillOutATicket( Flight flight,
                        String whereDoesFly,
                        String departurePoint);
    void removeTicket(int numberOfFlight);

}
