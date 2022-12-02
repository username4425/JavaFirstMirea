package ru.mirea.task16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Task16Exs2 {
    public static void main(String[] args){
        JFrame mainFrame = new JFrame("exs2");
        JTextArea text = new JTextArea(20,10);
        JPanel buttonPanel= new JPanel();
        JComboBox fonts = new JComboBox(new String[]{"Times New Roman", "MS Sans Serif", "Courier New"});
        JComboBox colors = new JComboBox((new String[]{"blue", "red", "yellow"}));
        buttonPanel.add(fonts);
        buttonPanel.add(colors);
        text.setLineWrap(true);
        FlowLayout fl = new FlowLayout();
        fl.setHgap(10);
        fl.setVgap(5);
        buttonPanel.setLayout(fl);
        buttonPanel.setBackground(Color.WHITE);
        mainFrame.setLayout(new BoxLayout(mainFrame.getContentPane(),BoxLayout.Y_AXIS));
        mainFrame.add(text);
        mainFrame.add(buttonPanel);
        fonts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String font = (String)fonts.getSelectedItem();
                Font old = text.getFont();
                Font replace=new Font(font, Font.PLAIN, old.getSize());
                text.setFont(replace);
            }
        });
        colors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int i = colors.getSelectedIndex();
                if(i == 0)
                    text.setForeground(Color.BLUE);
                else if(i == 1)
                    text.setForeground(Color.RED);
                else text.setForeground(Color.YELLOW);
            }
        });
        mainFrame.pack();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
