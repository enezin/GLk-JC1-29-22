package com.java.lessons.hometasks.hometask9;

public class NegativeNumber extends Exception {
    int number;

    public int getNumber() {
        return number;
    }

    public NegativeNumber(String message, int number) {
        super(message);
        this.number = number;
    }
}
