package ru.mirea.task11;

public class StudentTest {
    public static void main(String[] args){
        Student s=new Student("Name","Surname","Profession", "1","2",14,10,2000);
        System.out.println(s);
        System.out.println(s.getBirthDate(Student.DateFormat.SHORT));
        System.out.print(s.getBirthDate(Student.DateFormat.FULL));
    }
}
