package AirPort;

public class Airbus320 extends AbstractAircraft {

    //first type of airplane
    public Airbus320() {
        count++;
        this.id += count;
        this.countPlace = 70;
        this.model = this.getClass().getSimpleName();
        this.type = "Citizens";
    }

    @Override
    public String toString() {
        return "Airbus320{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
