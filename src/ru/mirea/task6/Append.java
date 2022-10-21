package ru.mirea.task6;

public class Append implements Command{
    private StringBuilder sb;
    private String arg;

    public Append(StringBuilder sb, String arg) {
        this.sb = sb;
        this.arg= arg;
    }

    public void execute(){
        sb.append(arg);
    }

    public String getResult(){
        return "";
    }

    public void undo(){
        sb.replace(sb.length()-arg.length(),sb.length(), "");
    }
}
