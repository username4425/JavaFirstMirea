package ru.mirea.task3;

public class TestHuman {
    public static void main(String[] args){
        Human human = new Human(85,180, new Human.Head("S","brown","dark"),
                new Human.Hand(55), new Human.Leg(70,41));
        System.out.print(human);
    }
}
