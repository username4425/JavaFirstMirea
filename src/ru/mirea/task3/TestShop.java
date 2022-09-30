package ru.mirea.task3;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args){
        InternetShop is=new InternetShop(new String[]{"item1", "item2", "item3", "item4"},new double[]{14.525,20,10.99,5.455});
        is.print();
        System.out.print("\nВыберите номер товара: ");
        int num,count,valute;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        System.out.print("Введите количество: ");
        count=in.nextInt();
        while(true) {
            System.out.print("1 - цена в рублях, 2 - цена в долларах: ");
            valute=in.nextInt();
            if(valute==1){
                System.out.printf("Цена товаров: %.3f",is.getCost(num)*count*ValuteConverter.course);
                break;
            }else if(valute==2){
                System.out.printf("Цена товаров: %.3f",is.getCost(num)*count);
                break;
            }else System.out.print("Неверно указан номер валюты.\n");
        }
        in.close();
    }
}
