package main.factory;

public class Freelancer extends Employee{
    public Freelancer(String name, String surName, int salary) {
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
