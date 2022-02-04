package AirporManagemet;

import AirPort.AbstractAircraft;

public class Flight {
    private int id;
    private String dateToFly;
    private String whereDoesFly;
    private String departurePoint;
    private String departureTime;
    private String arrivalTime;
    private AbstractAircraft aircraft;
    private static int count = 0;


    public Flight() {
        count++;

    }

    public Flight(String whereDoesFly,String departurePoint,String dateToFly,String departureTime ,String arrivalTime,AbstractAircraft aircraft) {
        count++;
        this.id+=count;
        this.dateToFly = dateToFly;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.whereDoesFly = whereDoesFly;
        this.departurePoint = departurePoint;

    }

    @Override
    public String toString() {
        return "Flight-> "+id +
                "\nWhere does fly-> "+ whereDoesFly +
                "\nDeparture point-> "+ departurePoint+
                "\nData to fly->"+dateToFly+
                "\nDeparture time-> "+ departureTime+
                "\nArrival time-> "+ arrivalTime+
                "\nAirplane-> "+ aircraft;
    }

    public String getDateToFly() {
        return dateToFly;
    }

    public void setDateToFly(String dateToFly) {
        this.dateToFly = dateToFly;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getWhereDoesFly() {
        return whereDoesFly;
    }

    public void setWhereDoesFly(String whereDoesFly) {
        this.whereDoesFly = whereDoesFly;
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flight.count = count;
    }
}
