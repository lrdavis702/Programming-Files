package DesignPatterns.RaceFactory;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Halflng.LightfootHalfing;
import DesignPatterns.RaceFactory.Halflng.StoutHalfling;

public class HalflingRace extends RaceFactory {
    Race createRace(String item) {

        String[] raceArray = new String[]{"Lightfoot", "Stout"};
        String menuTitle = "Choose Subclass";
        char userChoice;

        userChoice = CreateCharacter.makeSelection(raceArray, menuTitle);

        if (userChoice == 1) {
            return new LightfootHalfing();
        } else if (userChoice == 2) {
            return new StoutHalfling();
        } else
            return null;
    }
}