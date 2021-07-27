package DesignPatterns.RaceFactory.Halflng;

import DesignPatterns.RaceFactory.Race;

public class StoutHalfling extends Race {
    public StoutHalfling() {
        int minAge = 20;
        int maxAge = 250;

        // Race Traits
        name = "Stout Halfling";
        setAbilityScores(1, 2);
        setAge(minAge, maxAge);
        size = "Small";
        speed = 25;
        traits.add("Lucky");
        traits.add("Brave");
        traits.add("Halfling Nimbleness");
        languages.add("Common");
        languages.add("Halfling");

        // Subrace Traits
        setAbilityScores(2, 1);
        traits.add("Stout Resilience");
    }
}