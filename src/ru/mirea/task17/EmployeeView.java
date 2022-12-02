package ru.mirea.task17;

public class EmployeeView {
    private Employee model;

    public EmployeeView(Employee model){
        this.model = model;
    }

    public void updateView(){
        System.out.println("Employee: " + model.getFullName() + "\nPost: " + model.getPost()+
                "\nSalary: " + model.calculateSalary());
    }
}
