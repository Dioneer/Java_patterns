package Pegas.adapter.test;

import java.time.LocalDateTime;

public class AdapterST501 implements MeteoSenser2{
    private SmallSenser senser;
    public AdapterST501(SmallSenser senser) {
        this.senser = senser;
    }
    @Override
    public int getId() {
        return senser.getId();
    }
    @Override
    public double getTemperature() {
        return senser.getTemperature();
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
