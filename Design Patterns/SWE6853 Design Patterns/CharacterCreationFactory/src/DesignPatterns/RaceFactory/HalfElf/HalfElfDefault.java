package DesignPatterns.RaceFactory.HalfElf;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Race;

public class HalfElfDefault extends Race {
    public HalfElfDefault() {
        int minAge = 20;
        int maxAge = 180;
        String[] languageArray = new String[]{"Dwarvish", "Gnomish", "Halfling",
                "Orc", "Abyssal", "Giant", "Draconic", "Sylvan"};
        String languageTitle = "Choose Extra Language";
        String[] abilityArray = new String[]{"Strength",
                "Dexterity", "Constitution", "Intelligence",
                "Wisdom", "Charisma"};
        String abilityTitle = "Choose Extra Ability";
        char userChoice;

        // Race Traits
        name = "Half Elf";

        setAbilityScores(5, 2);
        userChoice = CreateCharacter.makeSelection(abilityArray, abilityTitle);
        setAbilityScores(userChoice, 1);
        userChoice = CreateCharacter.makeSelection(abilityArray, abilityTitle);
        setAbilityScores(userChoice, 1);

        setAge(minAge, maxAge);
        size = "Medium";
        speed = 30;
        traits.add("Darkvision");
        traits.add("Fey Ancestry");
        traits.add("Skill Versatility");
        languages.add("Common");
        languages.add("Elvish");
        userChoice = CreateCharacter.makeSelection(languageArray, languageTitle);
        languages.add(languageArray[userChoice]);
    }
}