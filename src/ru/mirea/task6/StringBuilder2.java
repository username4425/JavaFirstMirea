package ru.mirea.task6;

import java.util.LinkedList;

public class StringBuilder2 implements Observable{
    private StringBuilder sb;
    private LinkedList<Observer> observers;

    public StringBuilder2(){
        observers = new LinkedList<>();
        sb=new StringBuilder();
    }

    public StringBuilder2 append(String s){
        sb.append(s);
        notifyObservers("append");
        return this;
    }

    public String toString(){
        notifyObservers("toString");
        return sb.toString();
    }

    public StringBuilder2 reverse(){
        sb.reverse();
        notifyObservers("reverse");
        return this;
    }

    public int length(){
        notifyObservers("length");
        return sb.length();
    }
    public StringBuilder2 replace(int from, int to, String s){
        sb.replace(from, to, s);
        notifyObservers("replace");
        return this;
    }

    @Override
    public void addObserver(Observer o) {
        observers.push(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String event) {
        for(Observer o:observers)
            o.handleEvent(event);
    }
}
