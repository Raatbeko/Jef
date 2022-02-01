package AirPort;

public class Heller extends AbstractAircraft {

    //second type of airplane
    public Heller() {
        count++;
        this.id += count;
        this.countPlace = 120;
        this.model = this.getClass().getSimpleName();
        this.type = "Citizens";
    }

    @Override
    public String toString() {
        return "Heller{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
