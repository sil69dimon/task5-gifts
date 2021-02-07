package com.mason.app.shop;

import com.mason.app.gift.Sweets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GiftShop {

    private ArrayList<Sweets> sweets = new ArrayList<>();
    private Client client;

    public GiftShop() throws IOException {
        setSweetsBase();
        showAvailableSweets();
    }

    public void addClient() {
        client = new Client(sweets);

    }

    private void setSweetsBase() throws IOException {
        String filename = "src\\main\\resources\\sweets.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int countId = 1;

            while (br.ready()) {
                String[] fileLine = br.readLine().split(",");
                String sweetsName = fileLine[0];
                int sweetsPrice = Integer.parseInt(fileLine[1]);
                sweets.add(new Sweets(countId, sweetsName, sweetsPrice));
                countId++;
            }
        }
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    private void showAvailableSweets() {
        System.out.println("The following sweets are available to add as a gift:");
        sweets.forEach(System.out::println);
    }
}


