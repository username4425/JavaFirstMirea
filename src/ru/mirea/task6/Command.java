package ru.mirea.task6;

public interface Command {
    void execute();
    String getResult();
    void undo();
}
