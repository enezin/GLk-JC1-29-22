package com.java.lessons.hometasks.hometask10;

import java.io.*;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order implements Processing {
    private int id;
    private static List<Product> productsOrder;
    private String dateOFCreation;
    private int totalProducts;
    private double totalCost;

    public Order() {
    }

    public Order(int id, int totalProducts, double totalCost, String dateOFCreation) {
        this.id = id;
        this.totalProducts = totalProducts;
        this.totalCost = totalCost;
        this.dateOFCreation = dateOFCreation;
    }

    @Override
    public void add() {
        productsOrder = new ArrayList<>();
    }

    @Override
    public void remove() {
        productsOrder = null;
    }

    @Override
    public void print() {
        System.out.println("Information about your order:");
        if (productsOrder.isEmpty()) {
            System.out.println("Your order is empty!");
            System.out.println();
        } else {
            System.out.println("Your order has:");
            productsOrder.forEach(System.out::println);
            System.out.println();
        }
    }

    public void getCheck() {
        System.out.println("Information about your order:");
        dateOFCreation = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
        ;
        System.out.println("Your order has been created " + dateOFCreation);
        System.out.println("Product list:");
        productsOrder.forEach(System.out::println);
        System.out.println("Total number of products: " + productsOrder.size());
        for (Product product : productsOrder) {
            totalCost += product.getCost();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(totalCost);
        System.out.println("Total cost: " + result);
        System.out.println("Thank you for your purchase!");
        try {
            gettingFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void gettingFile() throws IOException {
        File file = Path.of("resources", "hometask10", "orderList.txt").toFile();
        file.createNewFile();
        try (var reader = new BufferedReader(new FileReader(file));
             var writer = new BufferedWriter(new FileWriter(file, true))) {
            int countId = 0;
            while (reader.readLine() != null) {
                countId++;
            }
            String order = new Order(countId, productsOrder.size(), totalCost, dateOFCreation).toString();
            writer.write(order);
            writer.newLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tCount of products: " + productsOrder.size() + "\tTotal cost: " + totalCost +
                "\tDate of Creation: " + dateOFCreation;
    }

    public List<Product> getProducts() {
        return productsOrder;
    }
}
