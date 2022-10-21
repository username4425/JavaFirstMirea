package ru.mirea.task6;

public class Magazine implements Printable{
    protected String name, frequency;

    public Magazine(String name, String frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public void print(){
        System.out.println("Name: "+name+", frequency: "+frequency);
    }
}
