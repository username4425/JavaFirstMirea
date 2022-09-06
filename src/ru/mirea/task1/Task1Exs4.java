package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Task1Exs4 {
    public static void main(String[] args){
        Random r =new Random();
        int arr1[] = new int[20], arr2[] = r.ints(20).toArray();
        for(int i=0;i<20;i++)
            arr1[i] = (int)Math.ceil(200000 * Math.random()) - 100000;//[-100000,100000]
        System.out.print("Массив 1 до сортировки: "+ Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.print("\nМассив 1 после сортировки: "+Arrays.toString(arr1));
        System.out.print("\nМассив 2 до сортировки: "+ Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.print("\nМассив 2 после сортировки: "+Arrays.toString(arr2));
    }
}
