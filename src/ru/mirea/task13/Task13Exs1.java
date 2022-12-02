package ru.mirea.task13;

public class Task13Exs1 {

    public static void main(String[] args){
        stringFunction("I like java !!!");
    }

    private static void stringFunction(String s){
        System.out.println("Последний символ строки: " + s.charAt(s.length() - 1));
        System.out.println(s.startsWith("I like")?"Начинается со строки \"I like\"":"Не начинается со строки \"I like\"");
        System.out.println(s.endsWith("!!!")?"Оканчивается на строку \"!!!\"":"Не оканчивается на строку \"!!!\"");
        if(s.contains("java")){
            System.out.println("Содержит строку \"java\" нач. индекс: " + s.indexOf("java"));
            System.out.println(s.substring(s.indexOf("java"),s.indexOf("java")+4));
        }else System.out.println("Не содержит строку \"java\"");
    }
}
