package DesignPatterns.RaceFactory.Elf;

import DesignPatterns.RaceFactory.Race;

public class DarkElf extends Race {
    public DarkElf() {
        int minAge = 100;
        int maxAge = 750;

        // Race Traits
        name = "Dark Elf";
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
        setAbilityScores(5, 1);
        traits.add("Superior Darkvision");
        traits.add("Sunlight Sensitivity");
        traits.add("Drow Magic");
        traits.add("Drow Weapon Training");
    }
}