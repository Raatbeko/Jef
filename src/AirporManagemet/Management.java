package AirporManagemet;

import AirPort.AbstractAircraft;

public interface Management {

    void addFlight(String departureTime, String arrivalTime, AbstractAircraft abstractAircraft,String status);
    void buyTicketOfNumberFlight();
    void showAllFlight();
    void report();
    void searchFlightByTicketNumber();

<<<<<<< HEAD
    void searchFlightByTicketNumber(Ticket[] tickets, int numberofFlight);
=======
>>>>>>> origin/master
}
