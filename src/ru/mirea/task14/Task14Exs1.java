package ru.mirea.task14;

import java.util.Scanner;

public class Task14Exs1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Введите строку: ");
        String enter = in.nextLine(), regex;
        System.out.print("Введите рег. выражение:  ");
        regex = in.nextLine();
        String[] split = enter.split(regex);
        for(int i = 0;i < split.length; i++)
            System.out.println((i + 1) + ") " + split[i]);
    }
}
