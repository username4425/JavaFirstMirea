package ru.mirea.task4;

enum Seasons{
    Winter("Зима",-5.5),
    Spring("Весна", 6.3),
    Summer("Лето",18.2){
        @Override
        public String getDescription(){
            return "Теплое время года.";
        }
    },
    Fall("Осень",5.7);
    private String name;
    private double avgtemp;
    Seasons(String s, double temp){
        name = s;
        avgtemp=temp;
    }
    public String getDescription(){
        return "Холодное время года.";
    }

    public double getAvgtemp(){
        return avgtemp;
    }

    public String toString(){
        return name;
    }
}

public class Task4Exs1 {
    public static void main(String[] args){
        Seasons[] seasons={Seasons.Fall,Seasons.Spring,Seasons.Winter,Seasons.Summer};
        for(Seasons s:seasons)
            System.out.println(s+": средняя температура: "+s.getAvgtemp()+", "+s.getDescription());
        printMessage(Seasons.Fall);
    }
    public static void printMessage(Seasons s){
        switch(s){
            case Summer:System.out.println("Я люблю лето.");break;
            case Spring:System.out.println("Я люблю весну.");break;
            case Fall:System.out.println("Я люблю осень");break;
            case Winter:System.out.println("Я люблю зиму.");break;
        }
    }
}
