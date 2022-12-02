package ru.mirea.task17;

public class MVCPatternDemo {
    public static void main(String[] args){
        Student student = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        System.out.println("Before changes:");
        controller.updateView();
        controller.setStudentName("Name2");
        controller.setStudentRollNo("RollNo2");
        System.out.println("After update:");
        controller.updateView();
    }
    private static Student retrieveStudentFromDatabase(){
        Student s = new Student();
        s.setName("Name1");
        s.setRollNo("RollNo1");
        return s;
    }
}
