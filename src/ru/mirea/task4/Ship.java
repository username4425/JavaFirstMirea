package ru.mirea.task4;

public class Ship extends Vehicle{
    public Ship(int cargoCost, int passengerCost, double time) {
        super(cargoCost, passengerCost, time);
    }

    public String getType(){
        return "Корабль";
    }
}
