package com.java.lessons.hometasks.hometask9;

public class Menu {
    static void start() {
        getNegativeNumber(1);
        getPositiveNumber(-4);
        concatenationOfTwoExceptions(7);
        catchExceptionElementOfString("Your son is good boy!", "daughter");
    }

    private static void getNegativeNumber(int number) {
        try {
            if (number > 0) throw new PositiveNumber("The number is more than zero!", number);
        } catch (PositiveNumber e) {
            System.out.println("Your number is " + e.getNumber() + ".");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The program worked correctly.");
            System.out.println("");
        }
    }

    private static void getPositiveNumber(int number) {
        try {
            if (number < 0) throw new NegativeNumber("The number is less than zero!", number);
        } catch (NegativeNumber e) {
            System.out.println("Your number is " + e.getNumber() + ".");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The program worked correctly.");
            System.out.println();
        }
    }

    private static void concatenationOfTwoExceptions(int number) {
        try {
            if (number > 0) throw new PositiveNumber("The number is more than zero!", number);
            else if (number < 0) throw new NegativeNumber("The number is less than zero!", number);
            else System.out.println("Your number is ZERO!");
        } catch (NegativeNumber | PositiveNumber e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The program worked correctly.");
            System.out.println();
        }
    }

    private static void getElementOfString(String string, String element) throws DoesNotContainElement {
        if (!string.contains(element))
            throw new DoesNotContainElement("Your string doesn't contain entered element!", element);
    }

    private static void catchExceptionElementOfString(String string, String element) {
        try {
            getElementOfString(string, element);
        } catch (DoesNotContainElement e) {
            System.out.println("Your element: " + e.getStringElement());
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The program worked correctly.");
            System.out.println("");
        }
    }
}
