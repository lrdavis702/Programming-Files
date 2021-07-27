package DesignPatterns.RaceFactory.Human;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Race;

public class DamaranHuman extends Race {
    public DamaranHuman() {
        int minAge = 20;
        int maxAge = 99;

        String[] languageArray = new String[]{"Dwarvish", "Elvish", "Gnomish", "Halfling",
                "Orc", "Abyssal", "Giant", "Draconic",};
        String menuTitle = "Choose Extra Language";
        char userChoice;

        userChoice = CreateCharacter.makeSelection(languageArray, menuTitle);


        // Race Traits
        name = "Damaran Human";

        // adds plus one to each ability
        for (int i = 0; i < 6; i++) {
            setAbilityScores(i, 1);
        }
        setAge(minAge, maxAge);
        size = "Medium";
        speed = 30;
        traits.add("Lucky");
        traits.add("Brave");
        traits.add("Halfling Nimbleness");
        languages.add("Common");
        languages.add(languageArray[userChoice]);
    }
}