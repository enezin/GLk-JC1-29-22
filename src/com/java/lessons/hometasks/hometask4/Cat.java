package com.java.lessons.hometasks.hometask4;

import java.util.Objects;
import java.util.Random;

public class Cat {
    public String defaultName = "Boris";
    public int defaultAge = 2;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = generateRandomText();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = generateRandomInt(1, 28);
    }

    public Cat() {
        this.name = generateRandomText();
        this.age = generateRandomInt(1, 28);
    }

    @Override
    public String toString() {
        return "His name is " + name + ". His age is " + age + " years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private int generateRandomInt(int startNum, int endNum) {
        Random random = new Random();
        return random.nextInt(endNum - startNum + 1) + startNum;
    }

    private String generateRandomText() {
        int length = generateRandomInt(3, 8);
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            int charCode = generateRandomInt(97, 122);
            text[i] = (char) charCode;
        }
        return new String(text);
    }
}
