package com.mason.app;

public class GiftBuilder {

    public Sweets sweets;
    public Package pack;

    /**
     * Constructor.
     */
    public GiftBuilder(Package pack, Sweets sweets) {

        if (pack == null || sweets == null) {
            throw new IllegalArgumentException("profession and name can not be null");
        }
        this.pack = pack;
        this.sweets = sweets;
    }

    public GiftBuilder withPackage(Package pack) {
        this.pack = pack;
        return this;
    }

    public GiftBuilder withSweets(Sweets sweets) {
        this.sweets = sweets;
        return this;
    }

      public Gift build() {
        return new Gift(this);
    }
}