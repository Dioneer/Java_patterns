package Pegas.factory;

public class Worker extends Employee{
    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }
    @Override
    public double calculateSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
