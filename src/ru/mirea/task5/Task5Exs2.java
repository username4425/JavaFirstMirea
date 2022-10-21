package ru.mirea.task5;

import java.awt.*;
import javax.swing.*;

public class Task5Exs2 {
    public static void main(String[] args){
        JFrame mainframe=new JFrame("exs2");
        mainframe.setSize(250,250);
        Shape[] figures=new Shape[20];
        for(int i=0;i<20;i++) {
            int f_n = (int) (Math.random() * 3);
            if (f_n == 0) {
                Circle c = new Circle();
                c.setRadius(Math.random() * 50);
                figures[i] = c;
            } else if (f_n == 1) {
                Square s = new Square();
                s.setSide(Math.random() * 50);
                figures[i] = s;
            } else {
                Rectangle rect = new Rectangle();
                rect.setLength(Math.random() * 50);
                rect.setWidth(Math.random() * 50);
                figures[i] = rect;
            }
            int c = (int) (Math.random() * 3);
            if (c == 0)
                figures[i].setColor(Color.RED);
            else if (c == 1)
                figures[i].setColor(Color.GREEN);
            else figures[i].setColor(Color.BLUE);
            figures[i].setXY((int) (200 * Math.random()), (int) (Math.random() * 200));
            figures[i].setFilled((int)(Math.random() * 2) % 2 == 0);
        }
        JPanel mainpanel = new JPanel(){
            @Override
            public void paint(Graphics g){
                for(Shape s:figures){
                    switch(s.getColor()){
                        case RED:g.setColor(java.awt.Color.RED);break;
                        case GREEN:g.setColor(java.awt.Color.GREEN);break;
                        case BLUE:g.setColor(java.awt.Color.BLUE);break;
                    }
                    if(s.getType()=="Прямоугольник"){
                        Rectangle rect=(Rectangle)s;
                        if(rect.isFilled())
                            g.fillRect(rect.getX(),rect.getY(),(int)rect.getWidth(),(int)rect.getLength());
                        else
                            g.drawRect(rect.getX(),rect.getY(),(int)rect.getWidth(),(int)rect.getLength());
                    }else if(s.getType()=="Круг"){
                        Circle c=(Circle)s;
                        if(c.isFilled())
                            g.fillOval(c.getX(), c.getY(),(int)c.getRadius(),(int)c.getRadius());
                        else
                            g.drawOval(c.getX(), c.getY(),(int)c.getRadius(),(int)c.getRadius());
                    }else{
                        Square square=(Square)s;
                        if(square.isFilled())
                            g.fillRect(square.getX(),square.getY(),(int)square.getSide(),(int)square.getSide());
                        else
                            g.drawRect(square.getX(),square.getY(),(int)square.getSide(),(int)square.getSide());
                    }
                }
            }
        };
        mainframe.add(mainpanel);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);

    }
}
