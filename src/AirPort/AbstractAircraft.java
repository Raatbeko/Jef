package AirPort;

public abstract class AbstractAircraft {

    protected int id;
    protected String model;
    protected String type;
    protected int countPlace;
    protected int count = 0;

    public AbstractAircraft() {

    }

    public AbstractAircraft(int id, String model, String type, int countPlace, int count) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.countPlace = countPlace;
        this.count = count;
    }

    public int getCountPlace() {
        return countPlace;
    }

    public void setCountPlace(int countPlace) {
        this.countPlace = countPlace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}


