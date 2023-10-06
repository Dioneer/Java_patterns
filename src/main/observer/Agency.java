package main.observer;
import java.util.ArrayList;
import java.util.List;
public class Agency implements Publisher{
    private  List<Observers> observersList = new ArrayList<>();
    @Override
    public void sendOffer(String company, int salary) {
        for(Observers observer :observersList){
            observer.receiverOffer(company, salary);
        }
    }
    @Override
    public void registerObserver(Observers observer) {
        observersList.add(observer);
    }
    @Override
    public void removeObserver(Observers observer) {
        observersList.remove(observer);
    }
}
