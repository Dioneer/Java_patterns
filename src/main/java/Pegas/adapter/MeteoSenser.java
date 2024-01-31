package Pegas.adapter;

import java.time.LocalDateTime;

public interface MeteoSenser {
    int getId();
    double getTemperature();
    double getHumidity();
    double getPressure();
    LocalDateTime getDateTime();
}
