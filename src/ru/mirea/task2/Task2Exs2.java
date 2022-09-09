package ru.mirea.task2;

public class Task2Exs2 {
    public static void main(String[] args){
        Ball ball = new Ball(500, Ball.Type.Volleyball);
        System.out.println(ball);
        ball.setCost(700);
        System.out.print("После изменения цены:\n" + ball);
    }
}
