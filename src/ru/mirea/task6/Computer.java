package ru.mirea.task6;

enum Manufacturer{
    MANUFACT1("Manufact1"),
    MANUFACT2("Manufact2"),
    MANUFACT3("Manufact3");
    private String manufacturerName;
    Manufacturer(String s){
        manufacturerName=s;
    }
}

public class Computer {
    private Processor processor;
    private Monitor monitor;
    private Memory memory;
    private Manufacturer manufacturer;
    private int cost;

    public Computer(Processor processor, Monitor monitor, Memory memory, Manufacturer manufacturer, int cost){
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
        this.manufacturer = manufacturer;
        this.cost=cost;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String toString(){
        return "Computer "+manufacturer+"\n"+processor+"\n"+memory+"\n"+monitor;
    }

    @Override
    public boolean equals(Object obj) {
        Computer other = (Computer)obj;
        return other.getMonitor() == monitor && other.getProcessor() == processor &&
                other.getManufacturer() == manufacturer && other.getMemory()==memory;
    }
}
