package ru.mirea.task3;

public class Employee {
    private double salary;
    private String fullname;

    public Employee(double salary, String fullname) {
        this.salary = salary;
        this.fullname = fullname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
