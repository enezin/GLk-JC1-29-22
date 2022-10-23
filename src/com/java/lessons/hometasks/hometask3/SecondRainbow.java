package com.java.lessons.hometasks.hometask3;

import java.util.Scanner;

public class SecondRainbow {
    public static final String RED = "red";
    public static final String ORANGE = "orange";
    public static final String YELLOW = "yellow";
    public static final String GREEN = "green";
    public static final String LIGHT_BLUE = "light blue";
    public static final String BLUE = "blue";
    public static final String PURPLE = "purple";

    public static String printColour(int numberOfColour) {
        switch (numberOfColour) {
            case 1:
                return RED;
            case 2:
                return ORANGE;
            case 3:
                return YELLOW;
            case 4:
                return GREEN;
            case 5:
                return LIGHT_BLUE;
            case 6:
                return BLUE;
            case 7:
                return PURPLE;
            default: return "colour not found";
        }
    }

    public void getColour() {
        System.out.println("Enter the count of colours 1 or 2:");
        int count = new Scanner(System.in).nextInt();
        if (count == 1) {
            getOneColour();
        } else if (count == 2) {
            getTwoColours();
        } else {
            printIncorrectMessage();
        }
    }

    public static void getOneColour() {
        System.out.println("Enter the number of colour from 1 to 7:");
        int firstColour = new Scanner(System.in).nextInt();
        if (firstColour > 0 && firstColour < 8) {
            System.out.println("Your colour is " + printColour(firstColour));
        } else {
            printIncorrectMessage();
        }
    }

    public static void getTwoColours() {
        System.out.println("Enter the first number of colour from 1 to 7:");
        int firstColour = new Scanner(System.in).nextInt();
        if (firstColour > 0 && firstColour < 8) {
            System.out.println("Enter the second number of colour from 1 to 7 (except for the first colour):");
            int secondColour = new Scanner(System.in).nextInt();
            if (secondColour > 0 && secondColour < 8 && secondColour != firstColour) {
                System.out.println("Your colour is " + printColour(firstColour) + "-" + printColour(secondColour));
            } else {
                printIncorrectMessage();
            }
        } else {
            printIncorrectMessage();
        }
    }

    public static void printIncorrectMessage() {
        System.out.println("You entered the incorrect value. Please try again...");
    }
}
