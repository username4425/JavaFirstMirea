package ru.mirea.task14;

import java.util.*;
import java.util.regex.*;

public class Task14Exs5 {
    private static boolean isVisYear(int year){
        return year > 0 && (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Pattern p = Pattern.compile("(\\d\\d)/(\\d\\d)/(\\d{4})");
        String s = in.nextLine();
        Matcher m = p.matcher(s);
        int[] days = {31, 28, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(m.matches()){
            int year = Integer.valueOf(m.group(3)), day = Integer.valueOf(m.group(1)), month = Integer.valueOf(m.group(2));
            if(year >= 1900 && month > 0 && month <= 12 && (day <= days[month - 1] || isVisYear(year) && day <= 29 && month == 2)) {
                System.out.print("Да");
            }else{
                System.out.print("Нет");
            }
        }else{
            System.out.print("Нет");
        }
        in.close();
    }
}
