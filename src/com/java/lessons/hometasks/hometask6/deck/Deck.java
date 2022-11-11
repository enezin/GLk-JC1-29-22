package com.java.lessons.hometasks.hometask6.deck;

import com.java.lessons.hometasks.hometask6.Menu;
import com.java.lessons.hometasks.hometask6.container.*;

public class Deck {
    Container[] containers = new Container[4];
    int countOfContainers;
    int containersType;

    public Deck() {
        this.containersType = Menu.generateRandomInt(0, 1);
        boolean isSmall;
        if (containersType == 0) {
            countOfContainers = 2;
            isSmall = false;
        } else {
            countOfContainers = 4;
            isSmall = true;
        }
        for (int i = 0; i < countOfContainers; i++) {
            switch (Menu.generateRandomInt(1, 3)) {
                case (1):
                    containers[i] = new Cylinder(isSmall);
                    break;
                case (2):
                    containers[i] = new Cube(isSmall);
                    break;
                case (3):
                    containers[i] = new Cone(isSmall);
            }
        }
    }

    public double getSumMass() {
        double mass = 0;
        for (int i = 0; i < countOfContainers; i++) {
            mass += containers[i].getMass();
        }
        return mass;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < countOfContainers; i++) {
            if (i > 0) result += "\n";
            result += "\t\tContainer " + (i + 1) + "\n" + containers[i];
        }
        return result;
    }
}