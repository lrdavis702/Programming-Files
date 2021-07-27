package DesignPatterns.RaceFactory;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Dwarf.HillDwarf;
import DesignPatterns.RaceFactory.Dwarf.MountainDwarf;

public class DwarfRace extends RaceFactory {
    Race createRace(String item) {

        String[] raceArray = new String[]{"Hill", "Mountain"};
        String menuTitle = "Choose Subclass";
        char userChoice;

        userChoice = CreateCharacter.makeSelection(raceArray, menuTitle);

        if (userChoice == 1) {
            return new HillDwarf();
        } else if (userChoice == 2) {
            return new MountainDwarf();
        } else
            return null;
    }
}