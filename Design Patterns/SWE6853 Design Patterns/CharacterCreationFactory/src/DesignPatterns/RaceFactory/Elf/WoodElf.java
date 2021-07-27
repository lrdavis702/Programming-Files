package DesignPatterns.RaceFactory.Elf;

import DesignPatterns.RaceFactory.Race;

public class WoodElf extends Race {
    public WoodElf() {
        int minAge = 100;
        int maxAge = 750;

        // Race Traits
        name = "Wood Elf";
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
        setAbilityScores(4, 1);
        traits.add("Elf Weapon Training");
        traits.add("Fleet of Foot");
        traits.add("Mask of the Wild");
    }
}
