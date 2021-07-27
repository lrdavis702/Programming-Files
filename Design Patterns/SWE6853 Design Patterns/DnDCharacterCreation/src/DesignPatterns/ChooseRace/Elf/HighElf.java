package DesignPatterns.ChooseRace.Elf;

import DesignPatterns.ChooseRace.Race;

public class HighElf extends Race {
    name = "High Elf";
    raceAbilityScoreMod[3] += 1;

    traits.add("Elf Weapon Training");
    traits.add("Cantrip");
    languages.add("Extra Language");
    hpMod += 1;
}
