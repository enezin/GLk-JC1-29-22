package com.java.lessons.hometasks.hometask5;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public String[][] matrix = new String[10][10];
    public String[] mainDiagonalArray = new String[matrix.length];
    public String[] secondaryDiagonalArray = new String[matrix.length];
    public String[] diagonalArray = new String[mainDiagonalArray.length + secondaryDiagonalArray.length];
    public String[] doubleOfArray;
    public StringBuilder stringsFromArray = new StringBuilder();

    public void startProgram() {
        creatingMatrix();
        getMainDiagonalArray();
        getSecondaryDiagonalArray();
        matchingArrays();
        getDiagonalArray();
        printStringsAndDoubles();
        printMainMatrix();
    }

    public String[][] creatingMatrix() {
        int countOfElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                countOfElements++;
                if (countOfElements % 3 == 0) {
                    matrix[i][j] = String.valueOf(generateRandomDouble(10)).substring(0, 7);
                } else {
                    matrix[i][j] = generateRandomString(7);
                }
            }
        }
        return matrix;
    }

    public String[] getMainDiagonalArray() {
        for (int i = 0; i < mainDiagonalArray.length; i++) {
            mainDiagonalArray[i] = matrix[i][i];
        }
        return mainDiagonalArray;
    }

    public String[] getSecondaryDiagonalArray() {
        for (int i = 0; i < secondaryDiagonalArray.length; i++) {
            secondaryDiagonalArray[i] = matrix[i][matrix.length - i - 1];
        }
        return secondaryDiagonalArray;
    }

    public void matchingArrays() {
        if (Arrays.equals(mainDiagonalArray, secondaryDiagonalArray)) {
            System.out.println("Arrays are match.");
        } else {
            System.out.println("Arrays are not match.");
        }
        System.out.println();
    }

    public String[] getDiagonalArray() {
        for (int i = 0; i < diagonalArray.length / 2; i++) {
            diagonalArray[i] = mainDiagonalArray[i];
            diagonalArray[i + mainDiagonalArray.length] = secondaryDiagonalArray[i];
        }
        return diagonalArray;
    }

    public void printStringsAndDoubles() {
        double tempArrayForDouble[] = new double[diagonalArray.length];
        int countOfDouble = -1;
        for (int i = 0; i < diagonalArray.length; i++) {
            if (!diagonalArray[i].contains(".")) {
                String substring = diagonalArray[i].substring(2, 4);
                if (!stringsFromArray.isEmpty()) {
                    stringsFromArray.append(", ");
                }
                stringsFromArray.append(substring);
            } else {
                double doubleOfArray = Double.parseDouble(diagonalArray[i]);
                double roundedNumber = Math.round(doubleOfArray);
                countOfDouble++;
                tempArrayForDouble[countOfDouble] = roundedNumber;
            }
        }
        doubleOfArray = new String[countOfDouble + 1];
        for (int i = 0; i <= countOfDouble; i++) {
            doubleOfArray[i] = String.valueOf(tempArrayForDouble[i]);
        }
        System.out.println(stringsFromArray);
        System.out.println();
        System.out.println(String.join("_", doubleOfArray));
        System.out.println();
    }

    public void printMainMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public double generateRandomDouble(int maxRangeOfDouble) {
        Random random = new Random();
        return random.nextDouble(maxRangeOfDouble);
    }

    public String generateRandomString(int lengthOfString) {
        Random random = new Random();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        int length = alphabet.length;
        char[] text = new char[lengthOfString];
        for (int i = 0; i < text.length; i++) {
            text[i] = alphabet[random.nextInt(length)];
        }
        return new String(text);
    }
}
