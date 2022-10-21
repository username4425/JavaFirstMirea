package ru.mirea.task5;

import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;

public class Task5Exs1 {
    public static void main(String[] args){
        AtomicInteger madrid_g=new AtomicInteger(0), milan_g=new AtomicInteger(0);
        JFrame mainframe=new JFrame("exs1");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainpanel=new JPanel(new GridLayout(2,1));
        JPanel buttonpanel=new JPanel();
        JPanel labelpanel=new JPanel();
        mainpanel.add(buttonpanel);
        mainpanel.add(labelpanel);
        JButton madrid=new JButton("Real Madrid");
        JButton milan = new JButton("AC Milan");
        JLabel result=new JLabel("0 X 0");
        buttonpanel.add(madrid);
        buttonpanel.add(result);
        buttonpanel.add(milan);
        JLabel last=new JLabel("Last Scorer: Real Madrid");
        JLabel winner=new JLabel("Winner: Real Madrid");
        labelpanel.add(last);
        labelpanel.add(winner);
        //mainframe.setSize(300,160);
        mainframe.getContentPane().add(mainpanel);
        madrid.addActionListener((e)->{
            int m_g=1 + madrid_g.getAndIncrement(), mil_g=milan_g.get();
            String text=m_g+" X "+mil_g;
            result.setText(text);
            last.setText("Last Scorer: Real Madrid");
            if(m_g > mil_g)
                winner.setText("Winner: Real Madrid");
            else if(m_g == mil_g)
                winner.setText("Winner: DRAW");
            else
                winner.setText("Winner: AC Milan");
        });
        milan.addActionListener((e)->{
            int m_g=madrid_g.get(), mil_g=1 + milan_g.getAndIncrement();
            String text=m_g+" X "+mil_g;
            result.setText(text);
            last.setText("Last Scorer: AC Milan");
            if(m_g > mil_g)
                winner.setText("Winner: Real Madrid");
            else if(m_g == mil_g)
                winner.setText("Winner: DRAW");
            else
                winner.setText("Winner: AC Milan");
        });
        mainframe.pack();
        last.setText("Last Scorer: N/A");
        winner.setText("Winner: DRAW");
        mainframe.setSize(mainframe.getWidth()+20, mainframe.getHeight());
        mainframe.setResizable(false);
        mainframe.setVisible(true);
    }
}
