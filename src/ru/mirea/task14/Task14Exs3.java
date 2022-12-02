package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.*;

public class Task14Exs3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Pattern p = Pattern.compile("\\d+(?:\\.\\d\\d)? +(?:USD|RUB|EU)");
        Matcher m = p.matcher(in.nextLine());
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
