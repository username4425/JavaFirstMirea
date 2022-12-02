package ru.mirea.task13;

public class Task13Exs5 {
    public static void main(String[] args){
        System.out.println(formatNumber("+79650245319"));
        System.out.println(formatNumber("89605555317"));
        System.out.println(formatNumber("+11000245319"));
    }
    public static String formatNumber(String number){
        if(number.charAt(0) == '8')
            number ="+7" + number.substring(1, number.length());
        number = number.substring(0,number.length() - 7) +"-"+number.substring(number.length() - 7, number.length() - 4) +
                "-" +number.substring(number.length() - 4, number.length());
        return number;
    }
}
