package ru.mirea.task2;

public class Shape {
    private String figureName;
    public Shape(String fn){
        figureName = fn;
    }
    public String toString(){
        return "Объект класса фигура. Имя - " + figureName;
    }
}
