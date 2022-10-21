package ru.mirea.task6;

public class MyObserver2 implements Observer{
    public void handleEvent(String event){
        if(event=="append"){
            System.out.println("Строки соединены");
        }else if(event=="toString"){
            System.out.println("StringBuilder преобразован в строку");
        }else if(event == "reverse"){
            System.out.println("Строка перевернута");
        }else if(event == "replace"){
            System.out.println("Часть строки была заменена");
        }else if(event=="length"){
            System.out.print("Найдена длина строки");
        }
    }
}
