package ru.mirea.task13;

public class Person {
    private String name, surName, patronymic;

    Person(){
        name = surName = patronymic = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFIO(){
        if(name != "" && surName != "" && patronymic != "")
            return surName + " "+name.charAt(0) + "." + patronymic.charAt(0)+".";
        else if(name != "" && surName != "")
            return surName + " " + name;
        else if(name != "")
            return name + " " + patronymic;
        else return "---";
    }
}
