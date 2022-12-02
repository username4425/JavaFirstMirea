package ru.mirea.task13;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person(), p2 = new Person(), p3 = new Person(), p4 = new Person();
        p1.setName("Name1");
        p1.setPatronymic("Patronymic");
        p1.setSurName("Surname");
        p2.setName("Name2");
        p2.setSurName("Surname2");
        p3.setName("Name3");
        p3.setPatronymic("Patronymic");
        p4.setSurName("Surname4");
        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
        System.out.println(p4.getFIO());
    }
}
