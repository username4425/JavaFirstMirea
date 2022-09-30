package ru.mirea.task4;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle(){}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType(){
        return "Прямоугольник";
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width + length);
    }

    public String toString(){
        return "Прямоугольник со сторонами "+width+" и "+length;
    }
}
