package ru.mirea.task4;

public class TestPerson {
    public static void main(String[] args){
        Person p1=new Person("Name Surname",24);
        Person p2=new Person("Name2 Surname2",20);
        p1.move();
        p1.talk();
    }
}
