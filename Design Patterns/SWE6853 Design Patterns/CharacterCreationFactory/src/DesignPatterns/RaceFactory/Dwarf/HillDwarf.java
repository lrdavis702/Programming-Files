package DesignPatterns.RaceFactory.Dwarf;

import DesignPatterns.RaceFactory.Race;

public class HillDwarf extends Race {
    public HillDwarf() {
        int minAge = 50;
        int maxAge = 350;

        // Race Traits
        name = "Hill Dwarf";
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
        setAbilityScores(4, 1);
        traits.add("Dwarven Toughness");
        setHpMod(1);
    }
}
