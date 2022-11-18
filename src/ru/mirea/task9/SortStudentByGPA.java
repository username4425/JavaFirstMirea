package ru.mirea.task9;

import java.util.Comparator;

public class SortStudentByGPA implements Comparator<Student> {
    public int compare(Student one, Student two){
        return Double.compare(one.getGpa(),two.getGpa());
    }
}
