package com.java.lessons.hometasks.hometask6.container;

import com.java.lessons.hometasks.hometask6.Menu;

import java.util.Locale;

public class Cylinder extends Container {

    public Cylinder(boolean isSmall) {
        super(isSmall);
    }

    public double getMass() {
        double MassOfCylinder = (height * 3.1415926535 * ((double) baseSize / 2) * ((double) baseSize / 2) / 3) * Menu.generateRandomDensity();
        return MassOfCylinder;
    }

    @Override
    public String toString() {
        return "\t\t\tForm: Cylinder" +
                "\t\tHeight: " + height +
                "\t\tBase size: " + baseSize +
                "\t\tMass of water: " + String.format(Locale.ROOT, "%.1f", getMass());
    }
}
