package ru.mirea.task9;

public class Task9Exs1 {
    public static void main(String[] args){
        Student arr[] = {
                new Student("Aname",9),
                new Student("Dname",10),
                new Student("Cname1",4),
                new Student("Cname0",10)
        };
        sort(arr);
        for(Student s:arr){
            System.out.println(s);
        }
    }

    public static void sort(Student arr[]){
        for(int j = 1; j< arr.length; j++){
            int i= j -1;
            Student key = arr[j];
            while(i >= 0 && key.compareTo(arr[i]) < 0){
                arr[i + 1]= arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }
}
