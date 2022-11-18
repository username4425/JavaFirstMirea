package ru.mirea.task11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task11Exs1 {
    public static void main(String[] args){
        Date curDate = new Date(System.currentTimeMillis());
        Calendar start = Calendar.getInstance();
        start.set(2022,9,1);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        System.out.printf("Дата получения работы: %d.%d.%d\n",  start.get(Calendar.DAY_OF_MONTH), start.get(Calendar.MONTH), start.get(Calendar.YEAR));
        System.out.print("Дата сдачи работы: "+formatter.format(curDate) + "\n");
    }
}
