package com.java.lessons.hometasks.hometask10;

import java.io.*;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;

public class Product implements Processing {
    Order order = new Order();
    private int id;
    private String name;
    private String dateOfManufacture;
    private double cost;
    private String country;

    private List<Product> productList = new ArrayList<>();

    public Product() {
        productList.add(new Product(0, "Apple", generateDateOfManufacture(), 0.79, "Poland"));
        productList.add(new Product(1, "Orange", generateDateOfManufacture(), 1.19, "Mexico"));
        productList.add(new Product(2, "Banana", generateDateOfManufacture(), 1.29, "Australia"));
        productList.add(new Product(3, "Tomato", generateDateOfManufacture(), 0.59, "Ukraine"));
        productList.add(new Product(4, "Cucumber", generateDateOfManufacture(), 0.49, "Belarus"));
        productList.add(new Product(5, "Onion", generateDateOfManufacture(), 0.29, "Belarus"));
        productList.add(new Product(6, "Milk", generateDateOfManufacture(), 1.49, "Belarus"));
        productList.add(new Product(7, "Butter", generateDateOfManufacture(), 1.99, "Belarus"));
        productList.add(new Product(8, "Yoghurt", generateDateOfManufacture(), 1.59, "Belarus"));
        productList.add(new Product(9, "Bread", generateDateOfManufacture(), 0.99, "Belarus"));
    }

    public Product(int id, String name, String dateOfManufacture, double cost, String country) {
        this.id = id;
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
        this.cost = cost;
        this.country = country;
    }

    @Override
    public void add() {
        generateDateOfManufacture();
        System.out.println("Enter the ID of the product which you want to add to the order (from 1 to "
                + productList.size() + "):");
        int productIndex = new Scanner(System.in).nextInt();
        if (productIndex <= 0 || productIndex > productList.size()) {
            System.out.println("You entered the incorrect value. Please try again...");
            add();
        } else {
            order.getProducts().add(productList.get(productIndex - 1));
            System.out.println("You added 1 psc " + productList.get(productIndex - 1).getName() + " to your order.");
            System.out.println();
        }

    }

    @Override
    public void remove() {
        System.out.println("Enter the number of the product which you want to remove from your order (from 1 to " +
                order.getProducts().size() + "):");
        int productIndex = new Scanner(System.in).nextInt();
        if (productIndex <= 0 || productIndex > order.getProducts().size()) {
            System.out.println("You entered the incorrect value. Please try again...");
            remove();
        } else {
            order.getProducts().remove(productList.get(productIndex - 1));
            System.out.println("You deleted 1 psc " + productList.get(productIndex - 1).getName() + " from your order.");
            System.out.println();
        }
    }

    @Override
    public void print() {
        System.out.println("Information about added products:");
        for (Product productPoint : order.getProducts()) {
            System.out.println(productPoint + "\tMade in: " + productPoint.country + "\tDate of manufacture: " + productPoint.getDateOfManufacture());
        }
    }

    public void gettingFile() throws IOException {
        File file = Path.of("resources", "hometask10", "profuctcInfo.txt").toFile();
        file.createNewFile();
        try(var writer = new BufferedWriter(new FileWriter(file, true))){
            for (Product productPoint : order.getProducts()) {
                writer.write(productPoint + "\tMade in: " + productPoint.country + "\tDate of manufacture: " + productPoint.getDateOfManufacture());
                writer.newLine();
            }
        }
    }

    public String generateDateOfManufacture() {
        Calendar cal = GregorianCalendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, generateRandomTime());
        cal.add(Calendar.HOUR_OF_DAY, generateRandomTime());
        cal.add(Calendar.MINUTE, generateRandomTime());
        Date tenDaysAgo = cal.getTime();
        dateOfManufacture = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(tenDaysAgo);
        return dateOfManufacture;
    }

    public int generateRandomTime() {
        Random random = new Random();
        return random.nextInt(-4, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getCost() {
        return cost;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "ID: " + (id + 1) + "\tProduct name: " + name + "\tCost: " + cost;
    }
}
