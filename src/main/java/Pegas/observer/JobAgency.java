package Pegas.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{
    private List<Observer> arr = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        arr.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        arr.remove(observer);
    }
    @Override
    public void sendOffer(String companyName, int salary) {
        for (Observer i: arr){
            i.receiveOffer(companyName,salary);
        }
    }
}
