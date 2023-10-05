package main.adapter;

import java.time.LocalDateTime;

public interface MeteoSensore {
    int getId();
    double gettemperature();
    double getHumidity();
    double getPressure();
    LocalDateTime getDateTime();

}
