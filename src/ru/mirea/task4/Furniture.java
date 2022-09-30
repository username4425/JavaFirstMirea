package ru.mirea.task4;

public abstract class Furniture {
    protected String model, color;
    protected int cost;

    public Furniture(String model, String color, int cost) {
        this.model = model;
        this.color = color;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
