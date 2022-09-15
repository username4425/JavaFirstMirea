package ru.mirea.task3;

public class Book implements Comparable<Book>{
    private String author, name, publisher, ISBN;
    private int year;

    public Book(String author, String name, String publisher, String ISBN, int year) {
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return name + " | " + author+"\nISBN: " + ISBN + "Год выпуска: " + year + "\nИздательство: "+publisher;
    }

    public int compareTo(Book other){
        return name.compareTo(other.name);
    }
}