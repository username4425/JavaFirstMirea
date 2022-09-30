package ru.mirea.task3;

public class ReportTest {
    public static void main(String[] args){
        Employee[] es={new Employee(35000,"Имя1 Фамилия1"), new Employee(50000,"Имя2 Фамилия2"),
        new Employee(27500.5,"Имя3 Фамилия3"),new Employee(59000.999,"Имя4 Фамилия4")};
        Report.generteReport(es);
    }
}
