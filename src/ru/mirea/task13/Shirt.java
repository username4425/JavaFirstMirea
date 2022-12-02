package ru.mirea.task13;

public class Shirt {
    private String id, name, color, size;
    public Shirt(String description){
        String[] s = description.split(",");
        if(s.length == 4){
               id = s[0];
               name = s[1];
               color = s[2];
               size = s[3];
        }else{
            id = name = size= color = "";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString(){
        return "ID: "+id+", Name: " + name + ", Size: "+size+", Color: "+color;
    }
}
