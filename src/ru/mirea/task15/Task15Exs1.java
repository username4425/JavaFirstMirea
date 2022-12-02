package ru.mirea.task15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task15Exs1 {
    public static void main(String[] args){
        JFrame mainFrame = new JFrame("exs2");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        String[] items={
                "Великобритания",
                "Россия",
                "Германия"
        };
        JComboBox cb = new JComboBox(items);
        JTextArea jta = new JTextArea(5,20);
        jta.setLineWrap(true);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JComboBox box = (JComboBox)actionEvent.getSource();
                int item = box.getSelectedIndex();
                if(item == 1){
                    jta.setText("Росси́я, или Росси́йская Федера́ция, — государство в Восточной Европе и Северной Азии. Россия — крупнейшее государство в мире, её территория в конституционных границах с территорией Крыма, аннексия которого не получила международного признания, составляет 17 125 191 км². Население страны в тех же границах составляет 147 182 123 чел. (2021; 9-е место в мире)");
                }else if(item == 0){
                    jta.setText("Великобрита́ния (русское название происходит от англ. Great Britain, или Соединённое Короле́вство — суверенное государство у северо-западного побережья континентальной Европы, состоящее из Англии, Уэльса, Шотландии и Северной Ирландии. Соединённое Королевство включает в себя остров Великобритания, северо-восточную часть острова Ирландия и множество более мелких Британских островов.");
                }else{
                    jta.setText("Герма́ния, полное официальное название — Федерати́вная Респу́блика Герма́ния — государство в Центральной Европе. Площадь территории — 357 408,74 км². Численность населения на 30 сентября 2019 года — 83 149 300 жителей. Занимает 19-е место в мире по численности населения (2-е в Европе) и 62-е в мире по территории (8-е в Европе).");
                }
                mainFrame.pack();
            }
        });
        mainPanel.add(cb, BorderLayout.NORTH);
        mainPanel.add(jta, BorderLayout.SOUTH);
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
