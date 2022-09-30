package ru.mirea.task3;

public class TestCircle {
    public static void main(String[] args){
        Tester test=new Tester(10);
        test.print();
        System.out.println("Круг с наименьшим радиусом: "+test.getSmallest());
        System.out.println("Круг с наибольшим радиусом: "+test.getBiggest());
        test.sort();
        test.print();
    }
}
