package ru.mirea.task4;

public class Employee {
    protected String firstName, lastName;
    protected double income;

    public Employee(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome(){
        return income;
    }
}
