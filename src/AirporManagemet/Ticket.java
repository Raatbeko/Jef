package AirporManagemet;

public class Ticket {
    public static int id = 1;
    private static int count;
    private Flight flight; // номер рейса
    private String whereDoesFly; //имя пассажира
    private String departurePoint;


    public Ticket() {
        count++;
        id+=count;
    }

    public Ticket(Flight flight, String whereDoesFly,String departurePoint) {
        count++;
        id += count;
        this.flight = flight;
        this.whereDoesFly = whereDoesFly;
        this.departurePoint = departurePoint;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Ticket.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getWhereDoesFly() {
        return whereDoesFly;
    }

    public void setWhereDoesFly(String name) {
        this.whereDoesFly = name;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }
}
