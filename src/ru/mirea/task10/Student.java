package ru.mirea.task10;

public class Student implements Comparable<Student> {
    private String name, surName, profession, course, group;

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

    public Student(String name, String surName, String profession, String course, String group) {
        this.name = name;
        this.surName = surName;
        this.profession = profession;
        this.course = course;
        this.group = group;
    }

    public String toString(){
        return name +" "+surName + ", cпециальность "+profession+", курс "+course+", группа "+group;
    }

    public int compareTo(Student other){
        return (name + surName).compareTo(other.name + other.surName);
    }
}
