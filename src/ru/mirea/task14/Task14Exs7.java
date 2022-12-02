package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.*;

public class Task14Exs7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Pattern p =Pattern.compile("(?:([A-Z])|([a-z])|(\\d)|_){8,}");
        String pswd = in.next();
        Matcher m = p.matcher(pswd);
        if(m.matches() && m.group(1) != null && m.group(2) != null && m.group(3) != null){
            System.out.println("Подходит");
        }else{
            System.out.print("Не подходит");
        }
    }
}
