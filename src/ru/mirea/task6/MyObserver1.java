package ru.mirea.task6;

public class MyObserver1 implements Observer{
    public void handleEvent(String event){
        System.out.println("[Event-"+event+"]");
    }
}
