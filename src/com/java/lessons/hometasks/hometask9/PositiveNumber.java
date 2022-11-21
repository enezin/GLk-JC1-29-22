package com.java.lessons.hometasks.hometask9;

public class PositiveNumber extends Exception {
    int number;

    public int getNumber() {
        return number;
    }

    public PositiveNumber(String message, int number) {
        super(message);
        this.number = number;
    }
}
