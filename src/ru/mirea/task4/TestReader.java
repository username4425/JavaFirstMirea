package ru.mirea.task4;

public class TestReader {
    public static void main(String[] args){
        Reader r=new Reader("Name 1","11111","exampe","744333",12,10,2003);
        r.takeBook();
        r.returnBook();
        r.takeBook("Book1","Book2");
        r.returnBook("Book1","Book2");
        r.takeBook(new Book("Book3","Author3"),new Book("Book4","Author4"));
        r.returnBook(new Book("Book3","Author3"),new Book("Book4","Author4"));
    }
}
