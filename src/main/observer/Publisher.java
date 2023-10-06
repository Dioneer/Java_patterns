package main.observer;

public interface Publisher {
    void sendOffer(String company, int salary);
    void registerObserver(Observers observer);
    void removeObserver(Observers observer);
}
