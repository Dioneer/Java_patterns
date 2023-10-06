package main.observer;

public class Student implements Observers{
    String name;
    int minSalary = 2000;

    public Student(String name) {
        this.name = name;
    }

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
