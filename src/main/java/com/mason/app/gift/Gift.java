package com.mason.app.gift;

import java.util.ArrayList;

public class Gift {

    private final Package pack;
    private final ArrayList<Sweets> sweets;

    public Gift(GiftBuilder giftBuilder) {
        this.sweets = giftBuilder.sweets;
        this.pack = giftBuilder.pack;
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