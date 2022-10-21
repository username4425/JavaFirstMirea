package ru.mirea.task5;
enum Color{
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");
    private String name;
    Color(String name){
        this.name=name;
    }
}
public abstract class Shape {
    protected Color color;
    protected boolean filled;
    protected int x, y;
    Shape(){ }
    Shape(Color color, boolean filled, int x, int y){
        this.color=color;
        this.filled=filled;
        this.x=x;
        this.y=y;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();
}
