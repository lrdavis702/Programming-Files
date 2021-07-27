package DesignPatterns.RaceFactory.Gnome;

import DesignPatterns.RaceFactory.Race;

public class ForestGnome extends Race {
    public ForestGnome() {
        int minAge = 40;
        int maxAge = 500;

        // Race Traits
        name = "Forest Gnome";
        setAbilityScores(3, 2);
        setAge(minAge, maxAge);
        size = "Small";
        speed = 25;
        traits.add("Darkvision");
        traits.add("Gnome Cunning");
        languages.add("Common");
        languages.add("Gnomish");

        // Subrace Traits
        setAbilityScores(1, 1);
        traits.add("Natural Illusionist");
        traits.add("Speaking with Small Beasts");
    }
}