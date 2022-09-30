package ru.mirea.task4;

public class Plane extends Vehicle{
    public Plane(int cargoCost, int passengerCost, double time) {
        super(cargoCost, passengerCost, time);
    }

    public String getType(){
        return "Самолет";
    }
}
