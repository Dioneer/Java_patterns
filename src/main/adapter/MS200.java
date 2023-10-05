package main.adapter;

import java.time.LocalDateTime;

public class MS200 implements MeteoSensore{

    private final int id;
    public MS200(int id) {
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

    @Override
    public double getHumidity() {
        return 23;
    }

    @Override
    public double getPressure() {
        return 23;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
