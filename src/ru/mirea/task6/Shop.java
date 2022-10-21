package ru.mirea.task6;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers=new ArrayList<>();

    public void addComputer(Computer c){
        computers.add(c);
    }

    public void removeComputer(Computer c){
        computers.remove(c);
    }

    public Computer getComputer(Manufacturer manufacturer, String processorName, String monitorName,
                                String memoryName){
        for(Computer c:computers){
            if(c.getManufacturer() == manufacturer && c.getProcessor().getName() == processorName &&
            c.getMonitor().getName() == monitorName && c.getMemory().getName() == memoryName)
                return c;
        }
        return null;
    }
}
