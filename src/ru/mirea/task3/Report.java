package ru.mirea.task3;

public class Report {
    public static void generteReport(Employee[] employees){
        System.out.printf("%-20s|%10s","Фамилия работника","з/п");
        for(Employee e:employees)
            System.out.printf("\n%-20s|%10.2f",e.getFullname(),e.getSalary());
    }
}
