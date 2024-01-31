package Pegas.observer;

public class Worker implements Observer{
    private String name;
    private int minSalary = 150000;

    public Worker(String name) {
        this.name = name;
    }
    @Override
    public void receiveOffer(String name, int salary) {
        if(this.minSalary<=salary){
            System.out.println("Worker agree");
        }else{
            System.out.println("Worker not agree");
        }
    }
}
