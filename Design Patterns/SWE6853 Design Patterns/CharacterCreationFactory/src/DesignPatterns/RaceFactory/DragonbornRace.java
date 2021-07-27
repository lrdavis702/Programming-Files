package DesignPatterns.RaceFactory;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Dragonborn.*;

public class DragonbornRace extends RaceFactory {
    Race createRace(String item) {

        String[] raceArray = new String[]{"Black", "Blue", "Brass", "Bronze",
                "White", "Gold", "Green", "Red", "Silver"};
        String menuTitle = "Choose Subclass";
        char userChoice;

        userChoice = CreateCharacter.makeSelection(raceArray, menuTitle);

        if (userChoice == 1) {
            return new BlackDragon();
        } else if (userChoice == 2) {
            return new BlueDragon();
        } else if (userChoice == 3) {
            return new WhiteDragon();
        } else if (userChoice == 4) {
            return new BronzeDragon();
        } else if (userChoice == 5) {
            return new CopperDragon();
        } else if (userChoice == 6) {
            return new GoldDragon();
        } else if (userChoice == 7) {
            return new GreenDragon();
        } else if (userChoice == 8) {
            return new RedDragon();
        } else if (userChoice == 9) {
            return new SilverDragon();
        } else
            return null;
    }
}

