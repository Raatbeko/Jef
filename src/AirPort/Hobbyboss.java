package AirPort;

public class Hobbyboss extends AbstractAircraft {

    //third type of airplane
    public Hobbyboss() {
        count++;
        this.id += count;
        this.model = this.getClass().getSimpleName();
        this.type = "Citizens";
    }

    @Override
    public String toString() {
        return "Hobbyboss{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
