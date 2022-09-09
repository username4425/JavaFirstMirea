package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;
    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHumanAge(){
        return age * 7;
    }

    public String toString(){
        return "Кличка собаки: "+ name + ",\nВозраст: "+age+", в \"человеческих\" годах это "+age*7+" лет.";
    }
}
