package ru.mirea.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3Exs5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        while(true){
            n=in.nextInt();
            if(n>0)break;
            else System.out.print("Введите число больше 0\n");
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=(int)(Math.random()*(n+1));
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> even_list=new ArrayList<>();
        for(int num:arr)
            if(num%2==0)
                even_list.add(num);
        int[] even=new int[even_list.size()];
        Arrays.setAll(even,even_list::get);
        System.out.print(Arrays.toString(even));
        in.close();
    }
}
