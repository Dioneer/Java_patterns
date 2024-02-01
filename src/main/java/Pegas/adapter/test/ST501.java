package Pegas.adapter.test;

public class ST501 implements SmallSenser {
    private int id;
    public ST501(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getTemperature() {
        return 55;
    }
}
