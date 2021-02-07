package com.mason.app.shop;

import java.io.IOException;

/**
 * Задача 5.
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Корректно спроектируйте и реализуйте предметную область задачи.
 * Для создания объектов из иерархии классов продумайте возможность использования
 * порождающих шаблонов проектирования.
 * Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * для проверки корректности переданных данных можно применить регулярные выражения.
 * Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * <p>
 * Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки
 * (объект, представляющий собой подарок). Составляющими целого подарка являются сладости и упаковка.
 */

public class GiftApp {
    public static void main(String[] args) throws IOException {
        start();
    }

    public static void start() throws IOException {
        GiftShop giftShop = new GiftShop();
        giftShop.addClient();
    }
}