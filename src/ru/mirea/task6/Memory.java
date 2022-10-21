package ru.mirea.task6;

public class Memory implements Nameable {
    private String name;
    private int memSize;

    public Memory(String name, int memSize) {
        this.name = name;
        this.memSize = memSize;
    }

    public String getName(){
        return name;
    }

    public int getMemSize(){
        return memSize;
    }

    public String toString(){
        return "Жесткий диск: "+name+" размер: "+memSize;
    }

    @Override
    public boolean equals(Object obj) {
        Memory m=(Memory) obj;
        return name == m.name && memSize == m.memSize;
    }
}
