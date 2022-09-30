package ru.mirea.task3;

public class InternetShop {
    private String[] goods;
    private double[] costs;

    public InternetShop(String[] goods, double[] costs) {
        this.goods = goods;
        this.costs = costs;
    }
    public void print(){
        for(int i=0;i<goods.length;i++)
            System.out.println((i+1)+") "+goods[i]+": "+costs[i]+" $");
    }
    public double getCost(int i){
        return costs[i];
    }
}
