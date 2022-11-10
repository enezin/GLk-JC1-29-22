package com.java.lessons.hometasks.hometask7;

import java.util.Random;

public class Factory {
    private FactoryOfBodies factoryOfBodies = new FactoryOfBodies();
    private FactoryOfHeads factoryOfHeads = new FactoryOfHeads();

    public FactoryOfBodies getFactoryOfBodies() {
        return factoryOfBodies;
    }

    public FactoryOfHeads getFactoryOfHeads() {
        return factoryOfHeads;
    }

    class FactoryOfBodies {
        public BodyType creatingBodies() {
            Random random = new Random();
            BodyType[] bodies = BodyType.values();
            return bodies[random.nextInt(bodies.length)];
        }
    }

    class FactoryOfHeads {
        public HeadType creatingHeads() {
            Random random = new Random();
            HeadType[] heads = HeadType.values();
            return heads[random.nextInt(heads.length)];
        }
    }
}
