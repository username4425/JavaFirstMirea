package ru.mirea.task1;

import java.util.Scanner;

public class Task1Exs5 {
    public static int factorial(int num){
        for(int f = num-1;f > 0;f--)
            num *= f;
        return num;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        System.out.print("Факториал числа: "+factorial(in.nextInt()));
        in.close();
    }
}
