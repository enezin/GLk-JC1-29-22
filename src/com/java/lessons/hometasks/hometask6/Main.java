package com.java.lessons.hometasks.hometask6;

import com.java.lessons.hometasks.hometask6.port.Port;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Port port = new Port();
        port.addShip();
        port.addShip();
        port.addShip();
        port.addShip();
        System.out.println(port);
        System.out.println();
        System.out.println("Total mass of water: " + String.format(Locale.ROOT, "%.1f", port.getSumMass()));
    }
}
