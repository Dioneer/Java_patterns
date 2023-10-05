package main.adapter;

public class MeteoStore {
    public boolean save(MeteoSensore meteoSensore){
        System.out.println("Saving data");
        meteoSensore.getId();
        meteoSensore.getDateTime();
        meteoSensore.gettemperature();
        meteoSensore.getHumidity();
        meteoSensore.getPressure();
        return true;
    }
}
