package ru.mirea.task8;

import java.util.Scanner;

public class Task8Exs17 {
    public static void main(String[] args){
        System.out.print(recFunc());
    }

    private static int recFunc(){
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        if(v != 0){
            int max = recFunc();
            return Math.max(max,v);
        }
        else return Integer.MIN_VALUE;
    }
}
