package com.mason.app;

public class Sweets {

    private int id;
    private String name;
    private int price;

    public Sweets(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Sweets(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ": " + name + " - " + price + " byn" ;
    }
}
