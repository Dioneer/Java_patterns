package Pegas.adapter.test;

import java.time.LocalDateTime;

public class MS201 implements MeteoSenser2{
    private int id;
    public MS201(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getTemperature() {
        return 500;
    }

    @Override
    public double getHumidity() {
        return 35;
    }

    @Override
    public double getPressure() {
        return 45;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
