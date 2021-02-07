package com.mason.app.gift;

import java.util.Objects;

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
        if (id != 0) {
            return id + ": " + name + " - " + price + " byn";
        } else {
            return name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return name.equals(sweets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
