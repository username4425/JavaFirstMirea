package ru.mirea.task6;

public class MovableCircle implements Movable{
    protected int radius;
    protected MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public String toString(){
        return "Circle "+center.toString()+" with radius "+radius;
    }
}
