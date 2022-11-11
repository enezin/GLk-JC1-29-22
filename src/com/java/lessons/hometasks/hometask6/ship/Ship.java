package com.java.lessons.hometasks.hometask6.ship;

import com.java.lessons.hometasks.hometask6.Menu;
import com.java.lessons.hometasks.hometask6.deck.Deck;

public class Ship {
    Deck[] decks = new Deck[2];

    String name;
    int countOfDecks;

    public Ship() {
        this.name = Menu.generateNameOfShip();
        this.countOfDecks = Menu.generateRandomInt(1, 2);
        for (int i = 0; i < countOfDecks; i++) {
            decks[i] = new Deck();
        }
    }
    public double getSumMass() {
        double summ = 0;
        for (int i = 0; i < countOfDecks; i++) {
            summ += decks[i].getSumMass();
        }
        return summ;
    }
    @Override
    public String toString() {
        String result = "Ship \"" + name + "\"\n";
        for (int i = 0; i < countOfDecks; i++) {
            if (i > 0) result += "\n";
            result += "\tDeck " + (i + 1) + "\n" + decks[i];
        }
        return result;
    }
}