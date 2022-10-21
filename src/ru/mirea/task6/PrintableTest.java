package ru.mirea.task6;

public class PrintableTest {
    public static void main(String[] args){
        Printable[] p = new Printable[4];
        p[0]=new Book("Name1","Author1");
        p[1]=new Magazine("Name2","each month");
        p[2]=new Magazine("Name3","2 times a month");
        p[3]=new Book("Name4","Author2");
        for(Printable i:p)
            i.print();
    }
}
