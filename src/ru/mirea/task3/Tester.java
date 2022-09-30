package ru.mirea.task3;

import java.util.Arrays;

public class Tester {
    private Circle[] circles;
    private int size;
    public static final String[] COLORS={"red","green","blue","yellow","pink","black"};
    Tester(int size){
        this.size=size;
        circles=new Circle[size];
        for(int i=0;i<size;i++)
            circles[i]=new Circle(new Point((int)(Math.random()*100 - 50),(int)(Math.random()*100 - 50)),
                    COLORS[(int)(Math.random()*COLORS.length)],(int)Math.ceil(Math.random()*1000));
    }
    public void sort(){
        Arrays.sort(circles);
    }

    public Circle getSmallest(){
        int res=0;
        for(int i=0;i<size;i++)
            if(circles[i].getRadius() < circles[res].getRadius())
                res=i;
        return circles[res];
    }

    public Circle getBiggest(){
        int res=0;
        for(int i=0;i<size;i++)
            if(circles[i].getRadius() > circles[res].getRadius())
                res=i;
        return circles[res];
    }
    public void print(){
        for(Circle c:circles)
            System.out.println(c);
    }
}
