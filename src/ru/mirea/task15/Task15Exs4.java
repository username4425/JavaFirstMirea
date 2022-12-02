package ru.mirea.task15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Task15Exs4 {
    public static void main(String[] args){
        JFrame mainFrame = new JFrame("exs4");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JTextArea jta = new JTextArea(1,10);
        mainPanel.add(jta,BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4));
        String[] labels = {"1","2","3","/","4","5","6","*","7","8","9","+","0",".","-"};
        for(int i=0;i<15;i++){
            final String op = labels[i];
            JButton button=new JButton(labels[i]);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    jta.append(op);
                    System.out.println(op);
                }
            });
            buttonPanel.add(button);
        }
        JButton calc = new JButton("=");
        buttonPanel.add(calc);
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String exp = jta.getText();
                String[] nums = exp.split("[+\\-/*()]");
                String[] ops = exp.split("\\d+(?:\\.\\d+)?");
                double res = Double.valueOf(nums[0]);
                int j = 1;
                for(int i=0;i<ops.length;i++){
                    String op=ops[i];
                    System.out.println("Op<"+op+">");
                    if(!op.equals("")){
                        double n = Double.valueOf(nums[j++]);
                        if(op.equals("+")){
                            res += n;
                        }else if(op.equals("-")){
                            res -= n;
                        }else if(op.equals("*")){
                            res *= n;
                        }else
                            res /= n;
                    }
                }
                jta.setText(String.valueOf(res));
            }
        });
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
