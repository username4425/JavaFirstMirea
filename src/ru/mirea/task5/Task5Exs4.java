package ru.mirea.task5;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Task5Exs4 {
    public static void main(String[] args){
        JFrame mainframe=new JFrame("exs4");
        mainframe.setSize(200,200);
        mainframe.setBackground(java.awt.Color.WHITE);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String path= FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        ImageIcon[] animation = new ImageIcon[6];
        for(int i=1;i<=6;i++){
            BufferedImage image=null;
            try{
                image= ImageIO.read(new File(path+"\\res\\animation"+i+".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
            animation[i - 1]=new ImageIcon(image);
        }
        AtomicInteger imageNum=new AtomicInteger(0);
        JPanel mainpanel=new JPanel();
        JLabel animationlabel=new JLabel(animation[0]);
        Timer timer=new Timer(250,(e)->{
            int n=imageNum.get();
            animationlabel.setIcon(animation[n]);
            n++;
            imageNum.set(n%6);
        });
        timer.start();
        mainpanel.setBackground(java.awt.Color.WHITE);
        mainpanel.add(animationlabel);
        mainframe.add(mainpanel);
        mainframe.setVisible(true);
    }
}
