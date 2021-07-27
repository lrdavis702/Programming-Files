package DesignPatterns.RaceFactory.Elf;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Race;

public class HighElf extends Race {
    public HighElf() {
        int minAge = 100;
        int maxAge = 750;
        String[] languageArray = new String[]{"Dwarvish", "Gnomish", "Halfling",
                "Orc", "Abyssal", "Giant", "Draconic", "Sylvan"};
        String menuTitle = "Choose Extra Language";
        char userChoice;

        userChoice = CreateCharacter.makeSelection(languageArray, menuTitle);

        // Race Traits
        name = "High Elf";
        setAbilityScores(1, 2);
        setAge(minAge, maxAge);
        size = "Medium";
        speed = 30;
        traits.add("Darkvision");
        traits.add("Keen Senses");
        traits.add("Fey Ancestry");
        traits.add("Trance");
        languages.add("Common");
        languages.add("Elvish");

        // Subrace Traits
        setAbilityScores(3, 1);
        traits.add("Elf Weapon Training");
        traits.add("Cantrip");
        languages.add(languageArray[userChoice]);
    }
}
