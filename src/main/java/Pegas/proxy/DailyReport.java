package Pegas.proxy;

import java.time.LocalDate;

public class DailyReport implements Report{
    @Override
    public String prepareReport(LocalDate localDate) {
        return "Daily report";
    }
}
