package ru.mirea.task3;

public class Circle implements Comparable<Circle> {
    private Point center;
    private int radius;
    private String color;
    Circle(Point center, String color, int radius){
        this.center=center;
        this.color=color;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int compareTo(Circle other){
        return Integer.compare(radius, other.radius);
    }

    public String toString(){
        return "Circle ("+center.getX()+", "+center.getY()+"), radius: "+radius+", color: "+color;
    }
}
