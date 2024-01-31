package Pegas.adapter;

public class MeteoStore {
    public boolean save(MeteoSenser meteoSenser){
        System.out.format("Saving data from sensor [%d] at %s%n temperature = %.2f ; humidity - %.2f; pressure - %.2f \n\r",
                meteoSenser.getId(), meteoSenser.getDateTime(), meteoSenser.getTemperature(),meteoSenser.getHumidity(),
                meteoSenser.getPressure());
        return true;
    }
}
