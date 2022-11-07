package com.java.lessons.hometasks.hometask6;

import java.util.Random;

public class Menu {

    public static final int DENSITY_1000 = 1000;
    public static final int DENSITY_2000 = 2000;

    public static String generateNameOfShip() {
        Random random = new Random();
        String[] namesOfShips = {"Aurora", "Victoria", "Arizona", "Cleopatra", "Missouri",
                "Santa Maria", "Mayflower", "Bismarck", "Siren", "Marquise"};
        String nameOfShips = namesOfShips[random.nextInt(namesOfShips.length)];
        return nameOfShips;
    }

    public static int generateRandomInt(int minValue, int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }

    public static int generateRandomDensity() {
        if (generateRandomInt(0, 1) == 0) {
            return DENSITY_1000;
        } else {
            return DENSITY_2000;
        }
    }
}
