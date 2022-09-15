package ru.mirea.task3;

public class Circle {
    private int radius, x, y;
    private String color;
    public Circle(int radius, int x, int y, String color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Круг ("+x+", "+y+"), радиус "+radius+", цвет "+color;
    }
}
