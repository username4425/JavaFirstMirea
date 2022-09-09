package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Dog> dogs = new ArrayList<>();
        boolean exit = false;
        while(!exit){
            System.out.print("1 - Добавить собаку\n2 - Вывести информацию на экран\n0 - Выйти\n");
            int r = in.nextInt();
            if(r == 1){
                System.out.print("Введите кличку: ");
                in.nextLine();
                String name = in.nextLine();
                System.out.print("Возраст: ");
                int age = in.nextInt();
                dogs.add(new Dog(age, name));
            }else if(r == 2){
                for(Dog d:dogs){
                    System.out.println(d);
                }
            }else exit = true;
        }
        in.close();
    }
}
