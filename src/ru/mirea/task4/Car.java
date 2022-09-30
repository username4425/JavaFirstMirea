package ru.mirea.task4;

public class Car extends Vehicle{
    public Car(int cargoCost, int passengerCost, double time) {
        super(cargoCost, passengerCost, time);
    }

    public String getType(){
        return "Автомобиль";
    }
}
