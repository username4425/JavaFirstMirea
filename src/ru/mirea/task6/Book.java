package ru.mirea.task6;

public class Book implements Printable{
    protected String name, author;

    public Book(String name, String author){
        this.name=name;
        this.author=author;
    }

    public void print(){
        System.out.println("Name: "+name+", author" + author);
    }
}
