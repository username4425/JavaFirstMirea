package ru.mirea.task4;

public class TestEmployee {
    public static void main(String[] args){
        Employee[] es={new Employee("Name1","Surname1",15000),
        new Manager("Name2","Surname2",19200,1544.99),
        new Employee("Name3","Surname3",8500)};
        for(Employee e:es)
            System.out.println(e.getIncome());
    }
}
