package AirporManagemet;

import AirPort.AbstractAircraft;

public interface Management {

    void addFlight(String departureTime, String arrivalTime, AbstractAircraft abstractAircraft);
    void buyTicketOfNumberFlight();
    void showAllFlight();
    void report();
    void searchFlightByTicketNumber(int numOfTicket);
    String checkingForFull();

}
