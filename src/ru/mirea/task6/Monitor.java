package ru.mirea.task6;

public class Monitor implements Nameable{
    private String name;
    private double diagonal;

    public Monitor(String name, double diagonal) {
        this.name = name;
        this.diagonal = diagonal;
    }

    public String getName(){
        return name;
    }

    public double getDiagonal(){
        return diagonal;
    }

    public String toString(){
        return "Монитор "+name+", диагональ "+ diagonal+" дюймов";
    }

    @Override
    public boolean equals(Object obj) {
        Monitor m=(Monitor) obj;
        return name == m.name && diagonal == m.diagonal;
    }
}
