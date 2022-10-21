package ru.mirea.task6;

public class Reverse implements Command{
    private StringBuilder sb;

    public Reverse(StringBuilder sb) {
        this.sb = sb;
    }

    public void execute(){
        sb.reverse();
    }

    public String getResult(){
        return "";
    }

    public void undo(){
        sb.reverse();
    }
}
