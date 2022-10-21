package ru.mirea.task5;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Task5Exs3 {
    public static void main(String[] args){
        JFrame mainframe= new JFrame("exs3");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(300,300);
        JPanel mainpanel=new JPanel(){
            @Override
            public void paint(Graphics g){
                BufferedImage i = null;
                try{
                    i = ImageIO.read(new File(args[0]));
                }catch(IOException e){
                    e.printStackTrace();
                }
                g.drawImage(i,0,0,this);
            }
        };
        mainframe.add(mainpanel);
        mainframe.setVisible(true);
    }
}
