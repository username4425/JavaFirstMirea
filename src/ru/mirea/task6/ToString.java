package ru.mirea.task6;

public class ToString implements Command{
    private StringBuilder sb;
    private String result;

    public ToString(StringBuilder sb) {
        this.sb = sb;
    }

    public void execute(){
        result=sb.toString();
    }

    public String getResult(){
        return result;
    }

    public void undo(){

    }
}
