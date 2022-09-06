package ru.mirea.task1;

import java.util.Arrays;

public class Task1Exs1 {
    public static void main(String[] args){
        int arr[] = {1,4,53,9,-42,35,25,100};
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for(int val:arr)
            sum1+=val;
        int k=0;
        while(k < arr.length)
            sum2+=arr[k++];
        k = 0;
        do {
            sum3+=arr[k++];
        }while(k < arr.length);
        System.out.println("Array: " + Arrays.toString(arr) + "\nSum: "+sum1+" "+sum2+" "+sum3);
    }
}
