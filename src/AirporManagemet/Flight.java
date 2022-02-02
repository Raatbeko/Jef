package AirporManagemet;

import AirPort.AbstractAircraft;

public class Flight {
    private int id;
    private String departureTime;
    private String arrivalTime;
    private AbstractAircraft aircraft;
    private String status;
    private static int count = 0;


    public Flight() {

    }

    public Flight(String departureTime ,String arrivalTime, String status,AbstractAircraft aircraft) {
        count++;
        this.id+=count;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
//                ", aircraft=" + aircraft +
                ", status='" + status + '\'' +
                '}';
    }

    public AbstractAircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(AbstractAircraft aircraft) {
        this.aircraft = aircraft;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flight.count = count;
    }
}
