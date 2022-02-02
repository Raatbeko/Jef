public class Flight {
    int id;
    String departureTime;
    String arrivalTime;
    //    Aircraft aircraft;
    String status;

    public Flight() {

    }

    public Flight(String departureTime, String arrivalTime, String status) {
        this.id++;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
//        this.aircraft = aircraft;
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
}

