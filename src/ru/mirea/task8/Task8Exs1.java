package ru.mirea.task8;

import java.util.Scanner;

public class Task8Exs1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        recFunc(n);
    }

    private static void recFunc(int n){
        if(n <= 1)
            System.out.print("1 ");
        else {
            int x = (int) Math.ceil((-1.0 + Math.sqrt(1 + 8 * n)) / 2.0);
            recFunc(n - 1);
            System.out.print(x + " ");
        }
    }
}
