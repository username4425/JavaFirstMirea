package ru.mirea.task4;

public class Train extends Vehicle{
    public Train(int cargoCost, int passengerCost, double time) {
        super(cargoCost, passengerCost, time);
    }

    public String getType(){
        return "Поезд";
    }
}
