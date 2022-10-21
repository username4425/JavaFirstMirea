package ru.mirea.task2;

public class TestAuthor {
    public static void main(String[] args){
        Author a1=new Author("Имя Фамилия","example1@gmail.com", 'M');
        Author a2=new Author("Имя2 Фамилия2","example2@gmail.com", 'F');
        System.out.println(a1);
        System.out.print(a2);
    }
}
