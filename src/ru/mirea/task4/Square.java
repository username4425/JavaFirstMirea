package ru.mirea.task4;

public class Square extends Rectangle{

    public Square(){}

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setWidth(double width){
        this.width=width;
        length=width;
    }

    public void setLength(double length){
        this.length=length;
        width=length;
    }

    public String getType(){
        return "Квадрат";
    }

    public String toString(){
        return "Квадрат со стороной "+width;
    }
}
