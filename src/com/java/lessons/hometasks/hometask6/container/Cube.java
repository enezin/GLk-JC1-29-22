package com.java.lessons.hometasks.hometask6.container;

import com.java.lessons.hometasks.hometask6.Menu;

import java.util.Locale;

public class Cube extends Container {

    public Cube(boolean isSmall) {
        super(isSmall);
    }

    public double getMass() {
        double MassOfCube = (baseSize * baseSize * height) * Menu.generateRandomDensity();
        return MassOfCube;
    }

    @Override
    public String toString() {
        return "\t\t\tForm: Cube" +
                "\t\tHeight: " + height +
                "\t\tBase size: " + baseSize +
                "\t\tMass of water: " + String.format(Locale.ROOT, "%.1f", getMass());
    }
}
