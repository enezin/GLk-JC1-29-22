package com.java.lessons.lesson3;

public class Main {
    public static final String RED = "красный";
    public static final String BLACK = "черный";
    public static final String YELLOW = "желтый";
    public static final String GREEN = "зеленый";

    public static void main(String[] args) {
        printRusColor(GREEN);
    }

    private static void printRusColor (String str) {
        switch (str) {
            case RED:
                System.out.println("Цвет красный");
                break;
            case BLACK:
                System.out.println("Цвет черный");
                break;
            case YELLOW:
                System.out.println("Цвет желтый");
                break;
            case GREEN:
                System.out.println("Цвет зеленый");
                break;
            default:
                System.out.println("Совпадений не было найдено");
        }
    }
}