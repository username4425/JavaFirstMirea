package ru.mirea.task9;

public class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int compareTo(Student other){
        return name.compareTo(other.name);
    }

    public String toString(){
        return name + " gpa: " + gpa;
    }
}
