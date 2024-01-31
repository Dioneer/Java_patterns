package Pegas.factory;

public class Freelancer extends Employee{
    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }
    @Override
    public double calculateSalary() {
        return salary/22 * 20.8;
    }
    @Override
    public String toString() {
        return "Freelancer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
