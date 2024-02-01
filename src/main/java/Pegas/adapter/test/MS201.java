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
        return 45;
    }
    @Override
    public double getHumidity() {
        return 58;
    }
    @Override
    public double getPressure() {
        return 745;
    }
    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
