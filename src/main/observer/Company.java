package main.observer;

import java.util.Random;

public class Company {
    private Random random = new Random();
    private int maxSalary;
    private String name;
    private Publisher publisher;
    public Company(int maxSalary, String name, Publisher publishery) {
        this.maxSalary = maxSalary;
        this.name = name;
        this.publisher = publishery;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        publisher.sendOffer(name, salary);
    }

}
