package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.*;

public class Task14Exs2 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String enter = in.nextLine();
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        if(p.matcher(enter).matches()){
            System.out.print("Да");
        }else{
            System.out.print("Нет");
        }
    }
}
