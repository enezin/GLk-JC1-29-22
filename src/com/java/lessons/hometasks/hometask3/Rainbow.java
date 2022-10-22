package com.java.lessons.hometasks.hometask3;

public class Rainbow {
    public static final String FIRST_COLOUR = "red";
    public static final String SECOND_COLOUR = "orange";
    public static final String THIRD_COLOUR = "yellow";
    public static final String FOURTH_COLOUR = "green";
    public static final String FIFTH_COLOUR = "light blue";
    public static final String SIXTH_COLOUR = "blue";
    public static final String SEVENTH_COLOUR = "purple";

    public static String firstColour;

    public String getFirstColour (int numberOfColour) {
        switch (numberOfColour) {
            case 1:
                firstColour = FIRST_COLOUR;
                break;
            case 2:
                firstColour = SECOND_COLOUR;
                break;
            case 3:
                firstColour = THIRD_COLOUR;
                break;
            case 4:
                firstColour = FOURTH_COLOUR;
                break;
            case 5:
                firstColour = FIFTH_COLOUR;
                break;
            case 6:
                firstColour = SIXTH_COLOUR;
                break;
            case 7:
                firstColour = SEVENTH_COLOUR;
                break;
            default:
        }
        return firstColour;
    }
}
