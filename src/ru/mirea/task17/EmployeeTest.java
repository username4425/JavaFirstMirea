package ru.mirea.task17;

public class EmployeeTest {
    public static void main(String[] args){
        Employee model = new Employee();
        EmployeeView view = new EmployeeView(model);
        EmployeeController controller = new EmployeeController(model, view);
        controller.setMinSalary(15000);
        controller.setSales(5);
        controller.setBonus(2000);
        controller.print();
    }
}
