package com.java.lessons.hometasks.hometask7;

import java.util.Random;

public class Menu implements AssemblyShop {

    Factory factory = new Factory();
    Factory.FactoryOfBodies factoryOfBodies = factory.getFactoryOfBodies();
    Factory.FactoryOfHeads factoryOfHeads = factory.getFactoryOfHeads();

    @Override
    public void getNewRobot() {
        Robot[] robots = new Robot[9];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot(Menu.getNameOfRobot(), factoryOfBodies.creatingBodies(), factoryOfHeads.creatingHeads());
            System.out.println(robots[i]);
        }
    }

    public static String getNameOfRobot() {
        Random random = new Random();
        String[] names = {"WALL-E", "R2D2", "Bender"};
        return names[random.nextInt(names.length)];
    }
}
