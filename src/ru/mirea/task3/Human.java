package ru.mirea.task3;

public class Human{
    public static class Head{
        private String size,  eyeColor, hairColor;
        public Head(String size, String eyeColor, String hairColor){
            this.size = size;
            this.eyeColor = eyeColor;
            this.hairColor = hairColor;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }

        public String getSize() {
            return size;
        }

        public String getEyeColor() {
            return eyeColor;
        }

        public String getHairColor() {
            return hairColor;
        }
        public String toString(){
            return "Размер головного убора - "+size+";\nЦвет глаз - "+eyeColor+"\nЦвет волос - "+hairColor;
        }
    }
    public static class Hand{
        private int length;

        public Hand(int length){
            this.length = length;
        }

        public int getLength(){
            return length;
        }

        public void setLength(int l){
            length = l;
        }
    }
    public static class Leg{
        private int length, footSize;
        public Leg(int length, int footSize){
            this.footSize = footSize;
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public int getFootSize() {
            return footSize;
        }

        public void setFootSize(int footSize){
            this.footSize = footSize;
        }

        public void setLength(int length) {
            this.length = length;
        }
        public String toString(){
            return "Размер обуви - " + footSize;
        }
    }
    private int weight, height;
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(int weight, int height, Head head, Hand hand, Leg leg) {
        this.weight = weight;
        this.height = height;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public Head getHead() {
        return head;
    }

    public Hand getHand() {
        return hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public String toString(){
        return "Рост: "+height+" см, вес: "+weight+" кг.\n"+head+"\n"+leg;
    }
}
