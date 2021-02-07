package com.mason.app.gift;

public enum Package {
    BOX, PACKET, PAPER;

    public static Package getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
