package main.adapter;

import java.time.LocalDateTime;

public class AdapterSt500 implements MeteoSensore{

    private SensorTemp sensorTemp;

    public AdapterSt500(SensorTemp sensorTemp) {
        this.sensorTemp = sensorTemp;
    }

    @Override
    public int getId() {
        return sensorTemp.getId();
    }

    @Override
    public double gettemperature() {
        return sensorTemp.gettemperature();
    }

    @Override
    public double getHumidity() {
        return 0;
    }

    @Override
    public double getPressure() {
        return 0;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
