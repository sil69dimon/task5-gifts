package com.mason.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SweetBase {
    private ArrayList<Sweets> sweets = new ArrayList<>();

    public SweetBase() throws IOException {
        addSweets();
        showAvailableSweets();

    }

    private void addSweets() throws IOException {
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

    private void showAvailableSweets() {
        sweets.forEach(System.out::println);
    }

}


