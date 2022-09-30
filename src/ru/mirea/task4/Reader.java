package ru.mirea.task4;

public class Reader {
    private String name, number, faculty, phone;
    private int dayOfBirth, monthOfBirth, yearOfBirth;

    public Reader(String name, String number, String faculty, String phone, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.name = name;
        this.number = number;
        this.faculty = faculty;
        this.phone = phone;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public void takeBook(){
        System.out.println(name + " взял книгу.\n");
    }

    public void returnBook(){
        System.out.print(name + " вернул книгу.\n");
    }

    public void takeBook(String... books){
        System.out.print(name + " взял книги: " + books[0]);
        for(int i=1;i<books.length;i++)
            System.out.print(", "+books[i]);
        System.out.print("\n");
    }

    public void returnBook(String... books){
        System.out.print(name + " вернул книги: " + books[0]);
        for(int i=1;i<books.length;i++)
            System.out.print(", "+books[i]);
        System.out.print("\n");
    }

    public void takeBook(int c){
        System.out.print(name + "взял "+c+" книг.\n");
    }

    public void returnBook(int c){
        System.out.print(name + "вернул "+c+" книг.\n");
    }

    public void takeBook(Book... books){
        System.out.print(name + " взял книги: " + books[0]);
        for(int i=1;i<books.length;i++)
            System.out.print(", "+books[i]);
        System.out.print("\n");
    }

    public void returnBook(Book... books){
        System.out.print(name + " вернул книги: " + books[0]);
        for(int i=1;i<books.length;i++)
            System.out.print(", "+books[i]);
        System.out.print("\n");
    }
}
