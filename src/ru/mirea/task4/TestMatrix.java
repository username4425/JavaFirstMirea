package ru.mirea.task4;

public class TestMatrix {
    public static void main(String[] args){
        Matrix m=new Matrix(new double[][]{new double[]{3,5},new double[]{8,0},new double[]{7,-2}},3,2);
        Matrix m2=new Matrix(new double[][]{new double[]{8,-2},new double[]{2,2},new double[]{0,0}},3,2);
        m.print();
        System.out.print("\n");
        m.sum(m2);
        m.print();
        System.out.print("\n");
        m.mul(1.5);
        m.print();
    }
}
