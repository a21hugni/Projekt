package com.example.projekt;

public class Grejer {

    private int ID;
    private String name;
    private String location;
    private String category;
    private int size;

    public Grejer(int ID, String name, String location, String category, int size) {
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.category = category;
        this.size = size;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
