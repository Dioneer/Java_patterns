package main.adapter;

public class St500 implements SensorTemp{
    private final int id;
    public St500(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double gettemperature() {
        return 23;
    }
}
