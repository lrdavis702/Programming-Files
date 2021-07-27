package DesignPatterns.ChooseRace.Tielfling;

import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;

public class TieflingRace extends RaceFactory {
    Race createRace(String subrace){
        int min = 18;
        int max = 120;

        age = (int)((Math.random() * (max/2 - min) + 1) + min);
        raceAbilityScoreMod[3] += 1;
        raceAbilityScoreMod[5] += 2;
        size = "Medium";
        speed = 30;
        traits.add("Darkvision");
        traits.add("Hellish Resistance");
        traits.add("Infernal Legacy");
        langauges.add("Common");
        languages.add("Infernal");

        return null;
    }
}
