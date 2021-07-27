package DesignPatterns.RaceFactory.Tiefling;

import DesignPatterns.RaceFactory.Race;

public class TielflingDefault extends Race {
    public TielflingDefault() {
        int minAge = 20;
        int maxAge = 110;

        // Race Traits
        name = "Tielfling";

        setAbilityScores(3, 1);
        setAbilityScores(5, 2);
        setAge(minAge, maxAge);
        size = "Medium";
        speed = 30;
        traits.add("Darkvision");
        traits.add("Hellish Resistance");
        traits.add("Infernal Legacy");
        languages.add("Common");
        languages.add("Infernal");
    }
}