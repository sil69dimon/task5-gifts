package com.mason.app.shop;

import com.mason.app.gift.Gift;
import com.mason.app.gift.GiftBuilder;
import com.mason.app.gift.Package;
import com.mason.app.gift.Sweets;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private String name;

    public Client(ArrayList<Sweets> sweets) {
        System.out.println("\nHello! What is your name?");
        inputName();

        System.out.println("\nMr." + name + ". Your randomly composed gift consists of:");

        Gift gift = newGift(sweets);

        int totalPrice = 0;
        for (int i = 0; i < gift.getSweets().size(); i++) {
            totalPrice += gift.getSweets().get(i).getPrice();
        }
        System.out.println(gift.toString() + "\nTotal price: " + totalPrice);
    }

    public void inputName() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("[A-Z][a-z]{2,10}")) {
            scanner.nextLine();
            System.out.println("Invalid input. " +
                    "The name must be 3 to 10 characters long and start with an uppercase letter.");
        }
        name = scanner.nextLine();
        scanner.close();
    }

    public Gift newGift(ArrayList<Sweets> sweets) {
        return new GiftBuilder()
                .withPackage(Package.getRandom())
                .withSweets(sweets)
                .build();
    }
}
