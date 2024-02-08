package Pegas.adapter.test;

import java.time.LocalDateTime;

public class AdapterST501 implements MeteoSenser2{
    private SmallSenser smallSenser;

    public AdapterST501(SmallSenser smallSenser) {
        this.smallSenser = smallSenser;
    }
    @Override
    public int getId() {
        return smallSenser.getId();
    }

    @Override
    public double getTemperature() {
        return smallSenser.getTemperature();
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
