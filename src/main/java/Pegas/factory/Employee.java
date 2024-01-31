package Pegas.factory;

public abstract class Employee {
    protected String name;
    protected String surName;
    protected double salary;
    public abstract double calculateSalary();

    public Employee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
