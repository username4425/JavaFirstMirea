package ru.mirea.task3;

import java.util.Arrays;

public class Task3Exs4 {
    public static void main(String[] args){
        int[] arr=new int[4];
        for(int i=0;i<4;i++)
            arr[i]=10 + (int)(Math.random()*90);
        System.out.println(Arrays.toString(arr));
        boolean isAscending=true;
        for(int i=0;i<3;i++)
            if(arr[i]>=arr[i+1]){
                isAscending=false;
                break;
            }
        if(isAscending)
            System.out.print("Это возрастающая последовательность.");
        else
            System.out.print("Это не возрастающая последовательность.");
    }
}
