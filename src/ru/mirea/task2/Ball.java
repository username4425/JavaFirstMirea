package ru.mirea.task2;

public class Ball {
    public enum Type{
        Football("Футбольный"),
        Basketball("Баскетбольный"),
        Volleyball("Волейбольный");
        private String title;
        Type(String s){
            title = s;
        }
        public String toString(){
            return title;
        }
    }
    private Type type;
    private int cost;
    public Ball(int cost, Type type) {
        this.cost = cost;
        this.type = type;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public String toString(){
        return type + " мяч, цена: "+cost;
    }
}
