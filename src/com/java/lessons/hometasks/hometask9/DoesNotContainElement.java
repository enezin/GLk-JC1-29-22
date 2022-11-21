package com.java.lessons.hometasks.hometask9;

public class DoesNotContainElement extends Exception {
    private String stringElement;

    public String getStringElement() {
        return stringElement;
    }

    public DoesNotContainElement(String message, String stringElement) {
        super(message);
        this.stringElement = stringElement;
    }
}
