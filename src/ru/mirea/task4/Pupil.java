package ru.mirea.task4;

public class Pupil extends Student{
    public Pupil(String name){
        super(name);
    }

    public String placeOfStudy(){
        return "Школа";
    }
}
