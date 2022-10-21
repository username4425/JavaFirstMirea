package ru.mirea.task2;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        while(true){
            n=in.nextInt();
            if(n  < 11 || n > 1)
                break;
        }
        String[] cards={"S2","S3","S4","S5","S6","S7","S8","S9","S10","SV","SQ","SK","SA",
                "C2","C3","C4","C5","C6","C7","C8","C9","C10","CV","CQ","CK","CA",
                "H2","H3","H4","H5","H6","H7","H8","H9","H10","HV","HQ","HK","HA",
                "D2","D3","D4","D5","D6","D7","D8","D9","D10","DV","DQ","DK","DA"};
        for(int i=0;i<52;i++){
            int pos;
            do{
                pos=(int)(Math.random()*52);
            }while(pos == i);
            String temp=cards[i];
            cards[i]=cards[pos];
            cards[pos]=temp;
        }
        for(int k = 0;k < n * 5;k++){
            if(k%5==0)
                System.out.print("Карты игрока №"+(k/5+1)+" "+cards[k]);
            else if(k%5==4)
                System.out.print(", "+cards[k]+"\n\n");
            else System.out.print(", "+cards[k]);
        }
    }
}
