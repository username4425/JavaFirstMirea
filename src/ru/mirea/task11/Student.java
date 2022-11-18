package ru.mirea.task11;

import java.util.Calendar;

public class Student implements Comparable<Student> {
    private String name, surName, profession, course, group;
    private Calendar birthDay;
    public enum DateFormat{
        SHORT,
        FULL
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String name, String surName, String profession, String course, String group, int day, int month, int year) {
        this.name = name;
        this.surName = surName;
        this.profession = profession;
        this.course = course;
        this.group = group;
        birthDay = Calendar.getInstance();
        birthDay.set(year,month - 1, day);
    }

    public String toString(){
        return name +" "+surName + ", cпециальность "+profession+", курс "+course+", группа "+group+
                ", дата рождения: " +String.format("%d.%d.%d", birthDay.get(Calendar.DAY_OF_MONTH), birthDay.get(Calendar.MONTH) + 1,
                birthDay.get(Calendar.YEAR));
    }

    public int compareTo(Student other){
        return (name + surName).compareTo(other.name + other.surName);
    }

    public String getBirthDate(DateFormat format){
        String date = "";
        switch(format){
            case SHORT:
                date = String.format("%d.%d.%d",birthDay.get(Calendar.DAY_OF_MONTH), birthDay.get(Calendar.MONTH) + 1,
                        birthDay.get(Calendar.YEAR));
                break;
            case FULL:
                String[] months={"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь"
                        , "Ноябрь", "Декабрь"};
                date = "День: " + birthDay.get(Calendar.DAY_OF_MONTH) + "\nМесяц: " + months[birthDay.get(Calendar.MONTH)]+
                        "\nГод: "+birthDay.get(Calendar.YEAR);
                break;
        }
        return date;
    }
}