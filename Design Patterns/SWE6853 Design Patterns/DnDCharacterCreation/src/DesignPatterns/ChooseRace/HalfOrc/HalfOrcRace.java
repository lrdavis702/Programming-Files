package DesignPatterns.ChooseRace.HalfOrc;

import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;

public class HalfOrcRace extends RaceFactory {
    Race createRace (String subrace){
        int min = 14;
        int max = 75;

        age = (int)((Math.random() * (max/2 - min) + 1) + min);
        raceAbilityScoreMod[0] += 2;
        raceAbilityScoreMod[2] +=1;
        size = "Medium";
        speed = 30;
        traits.add("Darkvision");
        traits.add("Menacing");
        traits.add("Relentless Endurance");
        traits.add("Savage Attacks");
        langauges.add("Common");
        languages.add("Orc");
        return null;
    }
}
