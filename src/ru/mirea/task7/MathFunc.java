package ru.mirea.task7;

public class MathFunc implements MathCalculable{

    @Override
    public int abs(int re, int im){
        return (int)Math.sqrt(re*re + im * im);
    }

    @Override
    public long pow(int number, int p){
        long res=number;
        for(int i = 0;i<p - 1;i++)
            res*=number;
        return res;
    }

    public double circleLength(int radius){
        return 2 * PI * radius;
    }
}
