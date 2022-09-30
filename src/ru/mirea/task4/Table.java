package ru.mirea.task4;

public class Table extends Furniture{
    protected boolean isFolding;
    public Table(String model, String color, int cost, boolean isFolding) {
        super(model, color, cost);
        this.isFolding=isFolding;
    }

    public boolean isFolding() {
        return isFolding;
    }
}
