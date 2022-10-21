package ru.mirea.task5;

public class Circle extends Shape {
    protected double radius;

    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }

    Circle(Color color, double radius, boolean filled,int x, int y){
        super(color,filled,x ,y);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){this.radius=radius;}

    public String getType(){
        return "Круг";
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "Круг с радиусом "+radius;
    }
}
