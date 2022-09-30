package ru.mirea.task4;

public abstract class Vehicle {
    protected int cargoCost, passengerCost;
    protected double time;

    public Vehicle(int cargoCost, int passengerCost, double time) {
        this.cargoCost = cargoCost;
        this.passengerCost = passengerCost;
        this.time=time;
    }

    public abstract String getType();

    public int getCargoCost(int weight){
        return weight * cargoCost;
    }

    public int getPassengersCost(int passengers){
        return passengers*passengerCost;
    }

    public double getTime(int distance){
        return distance*time;
    }
}
