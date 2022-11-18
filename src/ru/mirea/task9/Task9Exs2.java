package ru.mirea.task9;

public class Task9Exs2 {

    private static SortStudentByGPA comp = new SortStudentByGPA();

    public static void main(String[] args){
        Student arr[] = {
                new Student("Aname",9),
                new Student("Dname",10),
                new Student("Cname1",4),
                new Student("Cname0",7)
        };
        quickSort(arr);
        for(Student s:arr){
            System.out.println(s);
        }
    }

    public static void quickSort(Student arr[]){
        quickSortRec(arr,0,arr.length - 1);
    }

    private static void quickSortRec(Student arr[], int low, int high){
        if (arr.length == 0)
            return;
        int middle = low + (high - low) / 2;
        Student op = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (comp.compare(arr[i], op) > 0){
                i++;
            }
            while (comp.compare(arr[j], op) < 0) {
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortRec(arr, low, j);

        if (high > i)
            quickSortRec(arr, i, high);
    }
}
