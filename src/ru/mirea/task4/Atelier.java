package ru.mirea.task4;

interface MenClothing{
    void dressMan();
}

interface WomenClothing{
    void dressWoman();
}

abstract class Clothes{
    protected Size size;
    protected int cost;
    protected String color;

    public Clothes(Size size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getName();
}

class Tshirt extends Clothes implements MenClothing, WomenClothing{
    public void dressMan(){
        System.out.println("Man was dressed.");
    }
    public void dressWoman(){
        System.out.print("Woman was dressed.");
    }
    Tshirt(Size size, int cost, String color){
        super(size, cost, color);
    }

    public String getName(){
        return "Футболка";
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing{
    public void dressMan(){
        System.out.println("Man was dressed.");
    }
    public void dressWoman(){
        System.out.print("Woman was dressed.");
    }
    Pants(Size size, int cost, String color){
        super(size, cost, color);
    }

    public String getName(){
        return "Штаны";
    }
}

class Skirt extends Clothes implements WomenClothing{
    public void dressWoman(){
        System.out.print("Woman was dressed.");
    }
    Skirt(Size size, int cost, String color){
        super(size, cost, color);
    }

    public String getName(){
        return "Юбка";
    }
}

class Tie extends Clothes implements MenClothing{
    public void dressMan(){
        System.out.print("Man was dressed.");
    }
    Tie(Size size, int cost, String color){
        super(size, cost, color);
    }

    public String getName(){
        return "Галстук";
    }
}

enum Size{
    XXS(32){
        public String getDescription(){
            return "детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;
    Size(int es){
        euroSize=es;
    }
    public String getDescription() {
        return "взрослый размер";
    }
    public String toString(){
        return String.valueOf(euroSize);
    }
}

public class Atelier{
    public static void main(String[] args){
        Clothes[] clothes={new Tshirt(Size.S,1200, "черный"),
        new Pants(Size.XXS,2300,"коричневый"),
        new Skirt(Size.L,900,"белый"),
        new Tie(Size.M,250,"синий")};
        for(Clothes c:clothes)
            System.out.println(c.getName()+" - цвет: "+c.getColor()+", размер: "+c.getSize()+" ("
            + c.getSize().getDescription()+"), цена: "+c.getCost());
    }
}
