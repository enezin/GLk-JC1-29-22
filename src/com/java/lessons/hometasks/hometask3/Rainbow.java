package com.java.lessons.hometasks.hometask3;

public class Rainbow {
    public static final String RED = "red";
    public static final String ORANGE = "orange";
    public static final String YELLOW = "yellow";
    public static final String GREEN = "green";
    public static final String LIGHT_BLUE = "light blue";
    public static final String BLUE = "blue";
    public static final String PURPLE = "purple";

    public static String firstColour;

    public String getFirstColour (int numberOfColour) {
        switch (numberOfColour) {
            case 1: return RED;
            case 2: return ORANGE;
            case 3: return YELLOW;
            case 4: return GREEN;
            case 5: return LIGHT_BLUE;
            case 6: return BLUE;
            case 7: return PURPLE;
            default: return "color is not found";
        }
    }
}
