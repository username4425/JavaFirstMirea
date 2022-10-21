package ru.mirea.task6;

public class PriceExample implements Priceable{
    private int price;
    public PriceExample(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public static void main(String[] args){
        PriceExample pe=new PriceExample(200);
        System.out.print("Price "+pe.getPrice());
    }
}
