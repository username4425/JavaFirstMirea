package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;

public class Task16Exs1 {
    public static void main(String[] args){
        JFrame mainFrame = new JFrame("Exs1");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea password = new JTextArea(1,20), userName = new JTextArea("hello!!", 1,20), service = new JTextArea(1, 20);
        JLabel passwordLabel = new JLabel("Password"),
                userLabel = new JLabel("User name"),
                serviceLabel = new JLabel("Service");
        JPanel mainPanel1 = new JPanel(), mainPanel2 = new JPanel(), mainPanel3 = new JPanel(), margin = new JPanel();
        margin.setPreferredSize(new Dimension(100,50));
        FlowLayout fw = new FlowLayout();
        fw.setVgap(5);
        fw.setHgap(3);
        mainPanel1.setLayout(fw);
        mainPanel2.setLayout(fw);
        mainPanel3.setLayout(fw);
        mainPanel1.add(serviceLabel);
        mainPanel1.add(service);
        mainPanel2.add(userLabel);
        mainPanel2.add(userName);
        mainPanel3.add(passwordLabel);
        mainPanel3.add(password);
        mainFrame.setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.Y_AXIS));
        mainFrame.add(mainPanel1);
        mainFrame.add(mainPanel2);
        mainFrame.add(mainPanel3);
        mainFrame.add(margin);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
