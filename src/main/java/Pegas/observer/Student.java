package Pegas.observer;

public class Student implements Observer{
    private String name;
    private int minSalary = 2000;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public void receiveOffer(String name, int salary) {
        if(this.minSalary<=salary){
            System.out.println("Student agree");
        }else{
            System.out.println("Student not agree");
        }
    }
}
