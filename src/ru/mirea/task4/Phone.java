package ru.mirea.task4;

public class Phone {
    private String number, model;
    private double weight;

    public Phone(String number, String model){
        this.number=number;
        this.model=model;
    }

    public Phone(String number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(){
        number="number";
        model="default";
        weight=100;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Номер - "+number+", модель - "+model+", вес -"+weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    public void receiveCall(String name,String callnum){
        System.out.println("Звонит "+name+", с номера "+callnum);
    }

    public void sendMessage(String... nums){
        for(String n:nums)
            System.out.println(n);
    }
}
