package DesignPatterns.RaceFactory.Dragonborn;

import DesignPatterns.RaceFactory.Race;

public class BlueDragon extends Race {
    public BlueDragon() {
        int minAge = 15;
        int maxAge = 80;

        // Race Traits
        name = "Blue Dragonborn";
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
        traits.add("Breath Weapon - Lightning");
    }
}
