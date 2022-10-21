package ru.mirea.task6;

import java.util.LinkedList;

public class StringBuilder1 {
    LinkedList<Command> commands;

    public StringBuilder1(){
        commands = new LinkedList<>();
    }

    public void invoke(Command c){
        c.execute();
        if (! (c instanceof ToString))
            commands.push(c);
    }

    public void undo(){
        commands.pop().undo();
    }
}
