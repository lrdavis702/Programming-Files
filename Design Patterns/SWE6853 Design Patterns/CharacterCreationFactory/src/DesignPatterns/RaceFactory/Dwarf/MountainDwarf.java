package DesignPatterns.RaceFactory.Dwarf;

import DesignPatterns.RaceFactory.Race;

public class MountainDwarf extends Race {
    public MountainDwarf() {
        int minAge = 50;
        int maxAge = 350;

        // Race Traits
        name = "Mountain Dwarf";
        setAbilityScores(2, 2);
        setAge(minAge, maxAge);
        size = "Medium";
        speed = 25;
        traits.add("Darkvision");
        traits.add("Dwarven Resilence");
        traits.add("Dwarven Combat Training");
        traits.add("Tool Proficiency");
        traits.add("Stone Cutting");
        languages.add("Common");
        languages.add("Dwarven");

        // Subrace Traits
        setAbilityScores(0, 2);
        traits.add("Dwarven Armor Training");
        setHpMod(1);
    }
}
