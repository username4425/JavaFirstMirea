package ru.mirea.task6;

public class Task6Exs13 {
    public static void main(String[] args){
        StringBuilder2 sb=new StringBuilder2();
        sb.addObserver(new MyObserver1());
        sb.addObserver(new MyObserver2());
        sb.append("Hello ");
        sb.append("World!");
        System.out.println(sb.toString());
        sb.replace(5 ,sb.length(),"?");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.print(sb.toString());
    }
}
