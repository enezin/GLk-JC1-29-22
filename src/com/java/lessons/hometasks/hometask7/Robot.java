package com.java.lessons.hometasks.hometask7;

public class Robot {
    private String name;
    private BodyType bodyType;
    private HeadType headType;

    public Robot(String name, BodyType bodyType, HeadType headType) {
        this.name = name;
        this.bodyType = bodyType;
        this.headType = headType;
    }

    @Override
    public String toString() {
        return "This robot has name: " + name + ". Body type: " + bodyType.nameOfBody + ". Head type: " + headType.nameOfHead;
    }
}
