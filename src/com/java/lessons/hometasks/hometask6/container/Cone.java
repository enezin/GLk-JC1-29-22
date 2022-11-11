package com.java.lessons.hometasks.hometask6.container;

import com.java.lessons.hometasks.hometask6.Menu;

import java.util.Locale;

public class Cone extends Container {

    public Cone(boolean isSmall) {
        super(isSmall);
    }

    public double getMass() {
        double MassOfCone = ((1.0/ 3.0) * 3.1415926535 * ((double) baseSize / 2) * ((double) baseSize / 2) * height) * Menu.generateRandomDensity();
        return MassOfCone;
    }

    @Override
    public String toString() {
        return "\t\t\tForm: Cone" +
                "\t\tHeight: " + height +
                "\t\tBase size: " + baseSize +
                "\t\tMass of water: " + String.format(Locale.ROOT, "%.1f", getMass());
    }
}
