package ru.mirea.task10;

public class Task10Exs3 {
    public static void main(String[] args){
        Student[] arr1 = {
                new Student("Name3", "Surname3","profession3","3","group1"),
                new Student("Name5", "Surname5","profession5","2","group2"),
                new Student("Name1", "Surname1","profession1","1","group5")
        };
        Student[] arr2 ={
                new Student("Name2", "Surname2","profession2","2","group2"),
                new Student("Name4", "Surname4","profession4","1","group5")
        };
        Student[] arr = mergeStudents(arr1,arr2);
        for(Student s:arr){
            System.out.println(s);
        }
    }

    public static Student[] mergeStudents(Student[] arr1, Student[] arr2){
        Student[] arr=new Student[arr1.length + arr2.length];
        for(int i=0;i<arr1.length;i++)
            arr[i] = arr1[i];
        for(int j=0;j<arr2.length;j++)
            arr[arr1.length + j] = arr2[j];
        mergeSort(arr);
        return arr;
    }

    public static void mergeSort(Student[] arr) {
        rec_merge_sort(arr,1,arr.length);
    }

    private static void rec_merge_sort(Student[] arr,int low,int top) {
        if(top>low) {
            int mid=(top+low)/2;
            rec_merge_sort(arr,low,mid);
            rec_merge_sort(arr,mid+1,top);
            merge(arr,low,mid,top);
        }
    }

    private static void merge(Student[] arr,int low,int mid,int top) {
        int n1=mid-low+1, n2=top-mid, left_index=0, right_index=0;
        Student[] left=new Student[mid-low+1], right=new Student[top-mid];
        for(int i=low-1;i<mid;i++)
            left[i-low+1]=arr[i];
        for(int j=mid;j<top;j++)
            right[j-mid]=arr[j];
        for(int k=low-1;k<top;k++) {
            if(left_index==n1 || right_index!=n2 && left[left_index].compareTo(right[right_index]) > 0)
                arr[k]=right[right_index++];
            else
                arr[k]=left[left_index++];
        }
    }
}
