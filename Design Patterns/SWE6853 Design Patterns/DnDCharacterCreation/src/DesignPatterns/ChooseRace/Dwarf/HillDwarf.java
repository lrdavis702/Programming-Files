package DesignPatterns.ChooseRace.Dwarf;

import DesignPatterns.ChooseRace.Race;

public class HillDwarf extends Race {
    name = "Hill Dwarf";
    raceAbilityScoreMod[4] += 2;

    traits.add("Dwarven Toughness");
    hpMod += 1;
}