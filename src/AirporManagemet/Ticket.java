package AirporManagemet;

public class Ticket {
    private int id = 1;
    private static int count;
    private Flight flight;// номер рейса
    private int numOfPlace;

    public Ticket() {
        count++;
        id+=count;
    }

    public Ticket(Flight flight,int numOfPlace) {
        count++;
        id += count;
        this.numOfPlace = numOfPlace;
        this.flight = flight;

    }

    public int getNumOfPlace(){
        return numOfPlace;
    }

    public void setNumOfPlace(int numOfPlace) {
        this.numOfPlace = numOfPlace;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


}
