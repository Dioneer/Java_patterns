package main.observer;

public class Worker implements Observers{
    String name;

    public Worker(String name) {
        this.name = name;
    }

    int minSalary = 80000;

    @Override
    public void receiverOffer(String company, int salary) {
        if(this.minSalary<= salary){
            System.out.println("Agree");
            this.minSalary = salary;
        }else{
            System.out.println("Refuse");
        }
    }
}
