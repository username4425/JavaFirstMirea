package ru.mirea.task4;

public class Person {
    protected String fullName;
    protected int age;

    public Person(){

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.print(fullName+" идет.");
    }
    public void talk(){
        System.out.print(fullName + " говорит.");
    }
}
