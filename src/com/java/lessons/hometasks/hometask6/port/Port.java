package com.java.lessons.hometasks.hometask6.port;

import com.java.lessons.hometasks.hometask6.ship.Ship;

public class Port {
    Ship[] ships = new Ship[10];
    int countOfShips;

    public void addShip() {
        if (countOfShips >= 10) {
            System.out.println("The maximum number of ships in the port has been exceeded");
        } else {
            ships[countOfShips] = new Ship();
            countOfShips++;
        }
    }

    public double getSumMass() {
        double summ = 0;
        for (int i = 0; i < countOfShips; i++) {
            summ += ships[i].getSumMass();
        }
        return summ;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < countOfShips; i++) {
            if (i > 0) result += "\n";
            result += ships[i];
        }
        return result;
    }
}
