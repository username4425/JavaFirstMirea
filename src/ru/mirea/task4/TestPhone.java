package ru.mirea.task4;

public class TestPhone {
    public static void main(String[] args){
        Phone phone1=new Phone("365024","example model1",430);
        Phone phone2=new Phone("339017","example model2",200);
        Phone phone3=new Phone("999999","example model3",250);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("name1");
        phone1.receiveCall("name2","693011");
        phone1.sendMessage("351200","321990","180530");
    }
}
