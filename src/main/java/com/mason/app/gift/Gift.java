package com.mason.app.gift;

import java.util.ArrayList;

public class Gift {

    private Package pack;
    private ArrayList<Sweets> sweets;

    public Gift(Package pack, ArrayList<Sweets> sweets) {
        this.sweets = sweets;
        this.pack = pack;
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }

    public void setSweets(ArrayList<Sweets> sweets) {
        this.sweets = sweets;
    }


    public Package getPack() {
        return pack;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    @Override
    public String toString() {
        return "pack=" + pack +
                ", sweets=" + sweets;
    }
}