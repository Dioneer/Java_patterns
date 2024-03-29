package Pegas.observer;

import java.util.Random;

public class Company {
    private Random random= new Random();
    private Publisher jobAgency;
    private String name;
    private int maxSalary;
    public Company(Publisher jobAgency, String name, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(this.name,salary);
    }
}
