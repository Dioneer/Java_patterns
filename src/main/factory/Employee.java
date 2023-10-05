package main.factory;

public abstract class Employee {
    protected String name;
    protected String surName;

    public Employee(String name, String surName, int salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }
    protected int salary;
    public abstract double culculateSalary();

}
