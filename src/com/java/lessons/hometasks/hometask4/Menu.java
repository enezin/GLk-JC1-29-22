package com.java.lessons.hometasks.hometask4;

public class Menu {
    public void printWhile() {
        int countOfCatsForWhile = 10;
        while (countOfCatsForWhile > 0) {
            Cat firstCats = new Cat();
            System.out.println("His name is " + firstCats.defaultName + ". His age is " + firstCats.defaultAge + " years old.");
            countOfCatsForWhile--;
        }
    }

    public void printFor() {
        int countOfCatsForFor = 10;
        for (int i = 0; i < countOfCatsForFor; i++) {
            Cat secondCats = new Cat();
            secondCats.setName("Boris");
            secondCats.getName();
            secondCats.setAge(18);
            secondCats.getAge();
            System.out.println("His name is " + secondCats.getName() + ". His age is " + secondCats.getAge() + " years old.");
        }
    }

    public void printDoWhile() {
        int countOfCatsForDoWhile = 10;
        do {
            Cat thirdCats = new Cat();
            System.out.println(thirdCats);
            countOfCatsForDoWhile--;
        } while (countOfCatsForDoWhile > 0);
    }

    public void printForEach() {
        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat();
        catsArray[1] = new Cat();
        catsArray[2] = new Cat();
        catsArray[3] = new Cat();
        catsArray[4] = new Cat();

        for (Cat indexOfCatsArray : catsArray) {
            System.out.println(indexOfCatsArray);
        }
    }
}
