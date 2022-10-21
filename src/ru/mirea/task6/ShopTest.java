package ru.mirea.task6;

import java.util.Scanner;

public class ShopTest {
    private static Computer getComputer(){
        Scanner in=new Scanner(System.in);
        System.out.print("Введите название процессора: ");
        String processorName=in.nextLine();
        System.out.print("Введите частоту процессора (ГГц) ");
        double freq=in.nextDouble();
        Processor p = new Processor(processorName,freq);
        System.out.print("Введите название монитора: ");
        in.nextLine();
        String monitorName = in.nextLine();
        System.out.print("Введите диагональ монитора в дюймах: ");
        double diag=in.nextDouble();
        Monitor m=new Monitor(monitorName,diag);
        System.out.print("Введите название жесткого диска: ");
        in.nextLine();
        String memoryName = in.nextLine();
        System.out.print("Введите размер диска: ");
        int size=in.nextInt();
        Memory mem=new Memory(memoryName,size);
        System.out.print("Введите номер производителя(1 - 3)");
        int n=in.nextInt();
        Manufacturer manufacturer;
        if(n==1)
            manufacturer=Manufacturer.MANUFACT1;
        else if(n==2)
            manufacturer=Manufacturer.MANUFACT2;
        else
            manufacturer=Manufacturer.MANUFACT3;
        System.out.print("Введите цену: ");
        int cost=in.nextInt();
        in.nextLine();
        return new Computer(p,m,mem,manufacturer,cost);
    }

    public static void main(String[] args){
        boolean exit=false;
        Shop shop=new Shop();
        Scanner in=new Scanner(System.in);
        while(!exit){
            System.out.println("1 - Добавить компьютер\n2 - Удалить компьютер\n3 - Найти компьютер\n4 - Выйти");
            int choice=in.nextInt();
            if(choice == 1){
                Computer c=getComputer();
                shop.addComputer(c);
            }else if(choice == 2){
                Computer c=getComputer();
                shop.removeComputer(c);
            }else if(choice==3){
                String processorName, memoryName, monitorName;
                System.out.print("Введите номер производителя(1 - 3)");
                int n=in.nextInt();
                Manufacturer manufacturer;
                if(n==1)
                    manufacturer=Manufacturer.MANUFACT1;
                else if(n==2)
                    manufacturer=Manufacturer.MANUFACT2;
                else
                    manufacturer=Manufacturer.MANUFACT3;
                in.nextLine();
                System.out.print("Введите название процессора: ");
                processorName=in.nextLine();
                System.out.print("Введите название жесткого диска: ");
                memoryName=in.nextLine();
                System.out.print("Введите название монитора: ");
                monitorName=in.nextLine();
                Computer c=shop.getComputer(manufacturer,processorName,monitorName,memoryName);
                if(c!=null)
                    System.out.print(c);
                else System.out.print("Компьютер не найден.\n");
            }else if(choice == 4){
                exit=true;
            }else{
                System.out.print("Неизвестная команда.\n");
            }
        }
    }
}
