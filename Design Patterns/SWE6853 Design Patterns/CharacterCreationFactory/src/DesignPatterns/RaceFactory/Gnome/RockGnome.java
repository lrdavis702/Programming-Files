package DesignPatterns.RaceFactory.Gnome;

import DesignPatterns.RaceFactory.Race;

public class RockGnome extends Race {
    public RockGnome() {
        int minAge = 40;
        int maxAge = 500;

        // Race Traits
        name = "Rock Gnome";
        setAbilityScores(3, 2);
        setAge(minAge, maxAge);
        size = "Small";
        speed = 25;
        traits.add("Darkvision");
        traits.add("Gnome Cunning");
        languages.add("Common");
        languages.add("Gnomish");

        // Subrace Traits
        setAbilityScores(2, 1);
        traits.add("Artificer's Lore");
        traits.add("Tinker");
    }
}