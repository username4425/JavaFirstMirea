package ru.mirea.task4;

public class VehicleTest {
    public static void main(String[] args){
        Vehicle[] vh={new Plane(20,56,0.0015),new Train(5,4,0.02),
        new Ship(2,10,0.1),new Car(7,7,0.0167)};
        for(Vehicle v:vh){
            int weight=(int)Math.ceil(Math.random()*100), ps=(int)(Math.ceil(Math.random()*10)),
            dist=(int)(Math.ceil(Math.random()*1000));
            System.out.println(v.getType()+", "+weight+"  кг груза: "+v.getCargoCost(weight));
            System.out.println(v.getType()+", "+ps+"  пассажиров: "+v.getPassengersCost(ps));
            System.out.println(v.getType()+", "+dist+" км. "+v.getTime(dist)+" ч.");
        }
    }
}
