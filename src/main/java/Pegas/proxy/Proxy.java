package Pegas.proxy;

import java.time.LocalDate;
import java.util.HashMap;

public class Proxy implements Report{
    DailyReport dailyReport;
    private static HashMap<LocalDate, String> cach = new HashMap<>();
    public Proxy(DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }
    @Override
    public String prepareReport(LocalDate localDate) {
        if(cach.get(localDate)==null){
            String report = dailyReport.prepareReport(localDate);
            cach.put(localDate, report);
            return report;
        }
        return cach.get(localDate);
    }
}
