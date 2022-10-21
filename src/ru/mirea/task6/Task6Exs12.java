package ru.mirea.task6;

public class Task6Exs12 {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        Command c1=new Append(sb,"Hello ");
        Command c2=new Append(sb,"World!");
        Command c3=new Reverse(sb);
        Command c4=new ToString(sb);
        StringBuilder1 invoker=new StringBuilder1();
        invoker.invoke(c1);
        invoker.invoke(c2);
        invoker.invoke(c4);
        System.out.println(c4.getResult());
        invoker.invoke(c3);
        invoker.invoke(c4);
        System.out.println(c4.getResult());
        invoker.undo();
        invoker.undo();
        invoker.invoke(c4);
        System.out.print(c4.getResult());
    }
}
