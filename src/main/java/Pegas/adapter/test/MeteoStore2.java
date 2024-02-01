package Pegas.adapter.test;

public class MeteoStore2 {
    public static void main(String[] args) {
        showResulte(new MS201(13));
        showResulte(new AdapterST501(new ST501(31)));
    }
    public static void showResulte(MeteoSenser2 meteoSenser){
        System.out.format("Saving data from sensor [%d] at %s%n temperature = %.2f ; humidity - %.2f; pressure - %.2f \n\r",
                meteoSenser.getId(), meteoSenser.getDateTime(), meteoSenser.getTemperature(),meteoSenser.getHumidity(),
                meteoSenser.getPressure());
    }
}
