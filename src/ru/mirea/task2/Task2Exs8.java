package ru.mirea.task2;

import java.util.Arrays;

public class Task2Exs8 {
    public static void main(String[] args){
        for(int i=0;i<args.length/2;i++){
            String temp=args[i];
            args[i]=args[args.length-1-i];
            args[args.length - 1 -i]=temp;
        }
        System.out.print(Arrays.toString(args));
    }
}
