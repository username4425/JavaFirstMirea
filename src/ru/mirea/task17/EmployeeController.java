package ru.mirea.task17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setMinSalary(int minSalary){
        model.setMinSalary(minSalary);
    }

    public void setSales(int sales){
        model.setSales(sales);
    }

    public void setBonus(int bonus){
        model.setBonus(bonus);
    }

    public void setFullName(String fn){
        model.setFullName(fn);
    }

    public void setPost(String post){
        model.setPost(post);
    }

    public int calculateSalary(){
        return model.calculateSalary();
    }

    public void print(){
        view.updateView();
    }
}
