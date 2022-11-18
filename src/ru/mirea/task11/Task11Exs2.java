package ru.mirea.task11;

import java.util.Calendar;
import java.util.Scanner;

public class Task11Exs2 {
    public static void main(String[] args){
        System.out.print("Your date: ");
        Scanner in = new Scanner(System.in);
        String[] date = in.nextLine().split("[/\\.:]");
        Calendar userDate = Calendar.getInstance(), curDate = Calendar.getInstance();
        userDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]) - 1, Integer.parseInt(date[0]));
        curDate.setTimeInMillis(System.currentTimeMillis());
        if(userDate.compareTo(curDate) > 0)
            System.out.print("Current date is less than your date\n");
        else if(userDate.compareTo(curDate) < 0)
            System.out.print("Your date is less than current date\n");
        else
            System.out.print("Dates are equal\n");
    }
}
