package com.java.lessons.hometasks.hometask8;

public class Main {
    public static void main(String[] args) {
        MyList<Object> list = new MyArrayList<>();
        list.add("Mother");
        list.add("Father");
        list.add("Son");
        list.add("Daughter");
        list.add("Dog");
        list.add("Cat");
        list.add("Mouse");
        list.add("House");
        list.add("Garden");
        list.add("Apple");
        list.add("Samsung");
        list.add("Boy");
        list.add("Girl");
        list.add("Test");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Mother"));
        list.add(13, "8888");
        System.out.println(list.remove("8888"));
        System.out.println(list.get(13));
        list.set(2, "Java you are my punishment!");
        System.out.println(list.remove(2));
        System.out.println(list.indexOf("Apple"));
    }
}
