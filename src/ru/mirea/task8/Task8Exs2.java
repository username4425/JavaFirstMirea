package ru.mirea.task8;

import java.util.Scanner;

public class Task8Exs2 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n =in.nextInt();
        recFunc(n);
    }

    private static void recFunc(int n){
        if(n <= 1)
            System.out.print("1");
        else{
            recFunc(n - 1);
            System.out.print(" " + n);
        }
    }
}
