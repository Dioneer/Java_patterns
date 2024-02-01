package Pegas.adapter.test;

import java.time.LocalDateTime;

public interface MeteoSenser2 {
    int getId();
    double getTemperature();
    double getHumidity();
    double getPressure();
    LocalDateTime getDateTime();
}
