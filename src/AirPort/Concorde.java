package AirPort;

public class Concorde extends AbstractAircraft {

    //fourth type of airplane
    public Concorde() {
        count++;
        this.id += count;
        this.countPlace = 100;
        this.model = this.getClass().getSimpleName();
        this.type = "Citizens";
    }

    @Override
    public String toString() {
        return "Concorde{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
