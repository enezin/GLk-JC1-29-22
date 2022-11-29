package com.java.lessons.hometasks.hometask10;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Order order = new Order();
    Product product = new Product();

    void startProgram() {
        startMenu();
    }

    void startMenu() {
        printMainMenu();
        int key;
        System.out.println("Make your choice, please:");
        key = new Scanner(System.in).nextInt();
        if (order.getProducts() == null) {
            switch (key) {
                case 1:
                    order.add();
                    creatingOrder();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    printIncorrectMessage();
                    printMainMenu();
                    startMenu();
            }
        } else {
            switch (key) {
                case 1:
                    creatingOrder();
                    break;
                case 2:
                    order.print();
                    startMenu();
                    break;
                case 3:
                    order.remove();
                    startMenu();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    printIncorrectMessage();
                    startMenu();
            }
        }
    }

    void printMainMenu() {
        if (order.getProducts() == null) {
            System.out.println("Welcome to our online store!");
            System.out.println("1 - To place an order.");
            System.out.println("0 - To exit the program.");
            System.out.println();
        } else {
            System.out.println("1 - Continue to checkout.");
            System.out.println("2 - To get information about your order.");
            System.out.println("3 - To remove your order.");
            System.out.println("0 - To exit the program.");
            System.out.println();
        }
    }

    void creatingOrder() {
        System.out.println("1 - Add product to order.");
        System.out.println("2 - To remove this order.");
        System.out.println("3 - To get information about this order.");
        System.out.println("4 - Back to main menu.");
        System.out.println();

        int key;
        key = new Scanner(System.in).nextInt();

        switch (key) {
            case 1:
                System.out.println("Product list:");
                product.getProductList().forEach(System.out::println);
                System.out.println();
                product.add();
                addingToNotEmptyOrder();
                break;
            case 2:
                order.remove();
                startMenu();
                break;
            case 3:
                order.print();
                creatingOrder();
                break;
            case 4:
                startMenu();
                break;
            default:
                printIncorrectMessage();
                creatingOrder();
        }
    }

    public void addingToNotEmptyOrder() {
        System.out.println("1 - Add product to order.");
        System.out.println("2 - Remove product from order.");
        System.out.println("3 - Remove all products and remove the order and exit to main menu.");
        System.out.println("4 - Get information about added products.");
        System.out.println("5 - Complete purchase and print check.");
        System.out.println("0 - To exit the program.");
        System.out.println();

        int key;
        key = new Scanner(System.in).nextInt();

        switch (key) {
            case 1:
                product.add();
                addingToNotEmptyOrder();
                break;
            case 2:
                product.remove();
                addingToNotEmptyOrder();
                break;
            case 3:
                order.remove();
                startMenu();
                break;
            case 4:
                product.print();
                addingToNotEmptyOrder();
                break;
            case 5:
                order.getCheck();
                try {
                    product.gettingFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 0:
                exit();
            default:
                printIncorrectMessage();
                addingToNotEmptyOrder();
        }
    }

    public void printIncorrectMessage() {
        System.out.println("You entered the incorrect value. Please try again...");
        System.out.println();
    }

    public void exit() {
        System.out.println("Thank you for choosing our store! Goodbye!");
        System.exit(0);
    }
}
