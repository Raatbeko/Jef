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
    public void addFlight(String whereDoesFly, String departurePoint,String dateToFly ,String departureTime, String arrivalTime, AbstractAircraft abstractAircraft) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null) {
                flights[i] = new Flight(whereDoesFly, departurePoint,dateToFly ,departureTime, arrivalTime, abstractAircraft);
                return;
            }
        }
    }

    @Override
    public Flight buyTicketOfNumberFlight(int numberIfFlight) {
        try {
            for (Flight flight : flights) {
            if (flight.getId() == numberIfFlight) {
                return flight;
            }
        }
        }catch (NullPointerException ex){
            System.out.println("Flight not found!");
        }
        return null;
    }

    @Override
    public void showAllFlight() {
        int count =0;
        for (Flight flight : flights) {
            if (flight != null) {
                System.out.println(flight);
            }else {
                count++;
            }
        }
        if (flights.length == count){
            System.out.println("No flights!");
        }

    }

    @Override
    public String report() {

        return "Count on Flights -> " + Flight.getCount() + "\nNumber of tickets sold-> " + Ticket.getCount();

    }

    @Override
    public void searchFlightByTicketNumber(int numOfTicket) {
        try {
            boolean check = true;
            for (Ticket ticket : tickets) {
                if (ticket.getId() == numOfTicket) {
                    System.out.println("Ваш рейс: " + ticket.getFlight());
                    check = false;
                }
            }
            if (check) {
                System.out.println("Такого билета нету");
            }
        } catch (NullPointerException ex) {
            System.out.println("Flight not find!!!");
        }
    }

    @Override
    public String checkingForFull() {
        if (flights[flights.length - 1] != null) {
            return "Flights is full";
        }
        return "";

    }

    @Override
    public void fillOutATicket(Flight flight, int numOfPlace) {
        if (flight == null){
            return;
        }

        Ticket ticket = new Ticket(flight, numOfPlace);
        boolean chek = true;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == null) {
                tickets[i] = ticket;
                chek = false;
                System.out.println("You bought ticket!");
                System.out.println();
                System.out.println("Your place-> " + numOfPlace + "\n" + flight);
                break;
            }
        }
        if (chek) {
            System.out.println("All ticket sold out!!!");
        }

    }

    @Override
    public void removeTicket(int numberOfFlight) {
        boolean check = true;
        try {

            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i].getFlight().getId() == numberOfFlight) {
                    tickets[i] = null;
                    check = false;
                }
            }
            if (check) {
                System.out.println("Там тикетов и так нету!!");

            } else {
                System.out.println("Все тикеты удалены");
            }
        } catch (NullPointerException ex) {
            System.out.println("Flight not found!");
        }

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
