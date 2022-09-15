package ru.mirea.task3;

public class TestCircle {
    public static void main(String[] args){
        Circle circle = new Circle(10,13,-53,"yellow");
        System.out.print(circle);
        circle.setRadius(13);
        circle.setColor("White");
        circle.setX(10);
        circle.setY(20);
        System.out.print(circle);
    }
}
