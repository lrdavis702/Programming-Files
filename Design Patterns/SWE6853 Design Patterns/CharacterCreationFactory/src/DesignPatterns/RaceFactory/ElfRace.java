package DesignPatterns.RaceFactory;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Elf.DarkElf;
import DesignPatterns.RaceFactory.Elf.HighElf;
import DesignPatterns.RaceFactory.Elf.WoodElf;

public class ElfRace extends RaceFactory {
    Race createRace(String item) {

        String[] raceArray = new String[]{"Dark", "High", "Wood"};
        String menuTitle = "Choose Subclass";
        char userChoice;

        userChoice = CreateCharacter.makeSelection(raceArray, menuTitle);

        if (userChoice == 1) {
            return new DarkElf();
        } else if (userChoice == 2) {
            return new HighElf();
        } else if (userChoice == 3) {
            return new WoodElf();
        } else
            return null;
    }
}