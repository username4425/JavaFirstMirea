package ru.mirea.task6;

public class NameExample implements Nameable{
    private String name;

    public NameExample(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args){
        NameExample ne=new NameExample("Name");
        System.out.print(ne.getName());
    }
}
