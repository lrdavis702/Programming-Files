package DesignPatterns.RaceFactory;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Gnome.ForestGnome;
import DesignPatterns.RaceFactory.Gnome.RockGnome;

public class GnomeRace extends RaceFactory {
    Race createRace(String item) {

        String[] raceArray = new String[]{"Forest", "Rock"};
        String menuTitle = "Choose Subclass";
        char userChoice;

        userChoice = CreateCharacter.makeSelection(raceArray, menuTitle);

        if (userChoice == 1) {
            return new ForestGnome();
        } else if (userChoice == 2) {
            return new RockGnome();
        } else
            return null;
    }
}