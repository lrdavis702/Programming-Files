package DesignPatterns.RaceFactory.Dragonborn;

import DesignPatterns.RaceFactory.Race;

public class GoldDragon extends Race {
    public GoldDragon() {
        int minAge = 15;
        int maxAge = 80;

        // Race Traits
        name = "Gold Dragonborn";
        setAbilityScores(0, 2);
        setAbilityScores(5, 1);
        setAge(minAge, maxAge);
        size = "Medium";
        speed = 30;
        traits.add("Draconic Ancestry");
        traits.add("Damage Resistance");
        languages.add("Common");
        languages.add("Draconic");

        // Subrace Traits
        traits.add("Breath Weapon - Fire");
    }
}