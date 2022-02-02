package AirporManagemet;

public class Ticket {

    public static int id = 1;
    private int numTicket;
    private String flight; // номер рейса
    private String name; //имя пассажира

    public Ticket() {
        numTicket = id++;
        flight = "";
        name = "";
    }

    public Ticket(String flight, String name) {
        numTicket = id++;
        this.flight = flight;
        this.name = name;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
