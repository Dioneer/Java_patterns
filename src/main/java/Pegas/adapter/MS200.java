package Pegas.adapter;

import java.time.LocalDateTime;

public class MS200 implements MeteoSenser{
    private int id;

    public MS200(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getTemperature(){
        return 50;
    }

    @Override
    public double getHumidity() {
        return 50;
    }

    @Override
    public double getPressure() {
        return 757.4;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
