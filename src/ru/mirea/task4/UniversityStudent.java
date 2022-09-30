package ru.mirea.task4;

public class UniversityStudent extends Student{
    public UniversityStudent(String name){
        super(name);
    }
    public String placeOfStudy(){
        return "Университет";
    }
}
