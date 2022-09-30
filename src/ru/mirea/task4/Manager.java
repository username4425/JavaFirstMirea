package ru.mirea.task4;

public class Manager extends Employee{
    private double avgSum;

    public Manager(String firstName, String lastName, double income, double avgSum){
        super(firstName,lastName,income);
        this.avgSum=avgSum;
    }

    public double getIncome(){
        return income+avgSum;
    }
}
