package com.java.lessons.hometasks.hometask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This app can to show to you from one to seven Rainbows colour.");
        System.out.println("You can also choose a double-colour");
        System.out.println("Enter the count of colours which you want to see (1 or 2)...");

        int countOfColours = new Scanner(System.in).nextInt();

        if (countOfColours == 1) {
            System.out.println("Enter the number of colour from 1 to 7");
            int printOneColour = new Scanner(System.in).nextInt();
            if (printOneColour < 1 || printOneColour > 7) {
                System.out.println("You entered the incorrect number. Please try again...");
            } else {
                Rainbow oneFromTwo = new Rainbow();
                System.out.println("Your colour is " + oneFromTwo.getFirstColour(printOneColour));
            }
        } else if (countOfColours == 2) {
            System.out.println("Enter the number of the first colour from 1 to 7");
            int firstColour = new Scanner(System.in).nextInt();
            if (firstColour < 1 || firstColour > 7) {
                System.out.println("You entered the incorrect second number. Please try again...");
            } else {
                System.out.println("Enter the number of the second colour (don't using number of first colour)");
                int secondColour = new Scanner(System.in).nextInt();
                if (secondColour != firstColour && secondColour >= 1 && secondColour <= 7) {
                    Rainbow oneFromTwo = new Rainbow();
                    System.out.println("Your colour is " + oneFromTwo.getFirstColour(firstColour) + "-" + oneFromTwo.getFirstColour(secondColour));
                } else {
                    System.out.println("You entered the incorrect second number. Please try again...");
                }
            }
        } else {
            System.out.println("You entered the incorrect number. Please try again...");
        }
    }
}
