package DesignPatterns.RaceFactory.HalfOrc;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Race;

public class HalfElfOrcDefault extends Race {
    public HalfElfOrcDefault() {
        int minAge = 14;
        int maxAge = 75;

        // Race Traits
        name = "Half Orc";

        setAbilityScores(0, 2);
        setAbilityScores(2, 1);
        setAge(minAge, maxAge);
        size = "Medium";
        speed = 30;
        traits.add("Darkvision");
        traits.add("Menacing");
        traits.add("Relentless Endurance");
        traits.add("Savage Attacks");
        languages.add("Common");
        languages.add("Orc");
    }
}