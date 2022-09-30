package ru.mirea.task4;

public class TestStudent {
    public static void main(String[] args){
        Student[] students={new UniversityStudent("Name1"),new UniversityStudent("Name2"),new Pupil("Name3"),
        new UniversityStudent("Name4"), new Pupil("Name5")};
        System.out.print("Студенты:\n");
        for(Student s:students)
            if(s instanceof UniversityStudent)
                System.out.println(s.getName());
        System.out.print("Школьники:\n");
        for(Student s:students)
            if(s instanceof Pupil)
                System.out.println(s.getName());
    }
}
