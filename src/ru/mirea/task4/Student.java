package ru.mirea.task4;

public abstract class Student {
    private String name;

    public Student(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public abstract String placeOfStudy();
}
