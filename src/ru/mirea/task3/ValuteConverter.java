package ru.mirea.task3;

import java.util.Formatter;
import java.util.Scanner;

public class ValuteConverter {
    public static double course=58.82;
    public static String fromDtoR(double val){
        Formatter fm=new Formatter();
        fm.format("%.2f Доллар США равно %.2f Российский рубль.",val,val*course);
        return fm.toString();
    }
    public static String fromRtoD(double val){
        Formatter fm=new Formatter();
        fm.format("%.2f Российский рубль равно %.2f Доллар США.",val,val/course);
        return fm.toString();
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double val=in.nextDouble();
        System.out.print(fromRtoD(val)+"\n"+fromDtoR(val));
    }
}
