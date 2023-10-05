package main.factory;

public class Worker extends Employee{
    public Worker(String name, String surName, int salary) {
        super(name, surName, salary);
    }

    @Override
    public double culculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Worker; Medium salary - %.2f", surName, name, salary);
    }
}
