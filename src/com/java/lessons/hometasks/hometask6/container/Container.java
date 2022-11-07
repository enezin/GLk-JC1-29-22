package com.java.lessons.hometasks.hometask6.container;

import com.java.lessons.hometasks.hometask6.Menu;

public class Container {
    int baseSize;
    int height;

    public Container(boolean isSmall) {
        if (isSmall) {
            this.baseSize = 10;
        } else {
            this.baseSize = 20;
        }
        this.height = Menu.generateRandomInt(10, 100);
    }

    public double getMass() {
        return 0;
    }
}
