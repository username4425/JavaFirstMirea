package ru.mirea.task6;

public class Processor implements Nameable {
    private String name;
    private double frequency;

    public Processor(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName(){
        return name;
    }

    public double getFrequency(){
        return frequency;
    }

    public String toString(){
        return "Процессор " + name + ", частота "+ frequency;
    }

    @Override
    public boolean equals(Object obj){
        Processor p=(Processor) obj;
        return p.name == name && p.frequency == frequency;
    }
}
