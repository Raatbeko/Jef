package AirporManagemet;

public interface Management {

    void addFlight();
    void buyTicketOfNumberFlight();
    void showAllFlight();
    void report();
    void searchFlightByTicketNumber();

    void searchFlightByTicketNumber(Ticket[] tickets, int numberofFlight);
}
