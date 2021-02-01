package com.mason.app;

import java.util.ArrayList;

public class GiftBuilder {

    public ArrayList <Sweets> sweets;
    public Package pack;

    /**
     * Constructor.
     */
    public GiftBuilder(Package pack, ArrayList<Sweets> sweets) {

        if (pack == null || sweets == null) {
            throw new IllegalArgumentException("Type of package and sweets can't be null");
        }
        this.pack = pack;
        this.sweets = sweets;
    }

    public GiftBuilder withPackage(Package pack) {
        this.pack = pack;
        return this;
    }

    public GiftBuilder withSweets(ArrayList <Sweets> sweets) {
        this.sweets = sweets;
        return this;
    }

      public Gift build() {
        return new Gift(this);
    }

    @Override
    public String toString() {
        return "GiftBuilder{" +
                "sweets=" + sweets +
                ", pack=" + pack +
                '}';
    }
}