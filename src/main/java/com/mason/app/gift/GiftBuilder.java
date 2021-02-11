package com.mason.app.gift;

import java.util.ArrayList;

public class GiftBuilder {

    private ArrayList<Sweets> sweets;
    private Package pack;

    public GiftBuilder(ArrayList<Sweets> sweets, Package pack) {
        this.sweets = sweets;
        this.pack = pack;
    }

    public void setSweets(ArrayList<Sweets> sweets) {
        this.sweets = addSweetsToGift(sweets);
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }

    private ArrayList<Sweets> addSweetsToGift(ArrayList<Sweets> sweets) {
        ArrayList<Sweets> giftSweets = new ArrayList<>();
        int count = 0;

        while (count < 2) {
            int x = (int) (Math.random() * sweets.size());

            if (contain(giftSweets, sweets.get(x))) {
                giftSweets.add(new Sweets(sweets.get(x).getName(), sweets.get(x).getPrice()));
                count++;
            }
        }
        return giftSweets;
    }

    public boolean contain(ArrayList<Sweets> giftSweets, Sweets sweets) {
        if (giftSweets != null) {
            for (Sweets e : giftSweets)
                if (e.equals(sweets))
                    return false;
        }
        return true;
    }

    public Gift getResult() {
        return new Gift(pack, sweets);
    }
}