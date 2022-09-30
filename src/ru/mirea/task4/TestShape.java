package ru.mirea.task4;

public class TestShape {
    public static void main(String[] args){
        Shape[] figures={new Circle(12),new Rectangle(3,5),new Square(3)};
        for(Shape figure:figures)
            System.out.printf("%s, площадь: %.3f, периметр: %.3f\n",figure.toString(),figure.getArea(), figure.getPerimeter());
    }
}
