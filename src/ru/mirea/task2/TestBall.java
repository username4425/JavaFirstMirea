package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args){
        Ball ball1=new Ball(10.4,-43);
        Ball ball2=new Ball(0,9.14);
        System.out.println(ball1+"\n"+ball2);
        ball1.move(0,3);
        ball2.move(1,4);
        System.out.print(ball1+"\n"+ball2);
    }
}
