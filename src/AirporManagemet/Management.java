package AirporManagemet;

import AirPort.AbstractAircraft;

public interface Management {

    void addFlight(String whereDoesFly,String departurePoint,String dateToFly,String departureTime, String arrivalTime, AbstractAircraft abstractAircraft);

    Flight buyTicketOfNumberFlight(int numberOfFlight);

    void showAllFlight();

    String report();

    void searchFlightByTicketNumber(int numOfTicket);

    String checkingForFull();

    void fillOutATicket( Flight flight,int numOfPlace);

    void removeTicket(int numberOfFlight);

}
