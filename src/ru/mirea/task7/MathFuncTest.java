package ru.mirea.task7;

public class MathFuncTest {
    public static void main(String[] args){
        MathCalculable calc = new MathFunc();
        System.out.println("z = 3 + 4i, |z| = " + calc.abs(3,4));
        System.out.println("6^3 = "+calc.pow(6,3));
        System.out.println("Длина окружности радиуса 5: " + calc.circleLength(5));
    }
}
