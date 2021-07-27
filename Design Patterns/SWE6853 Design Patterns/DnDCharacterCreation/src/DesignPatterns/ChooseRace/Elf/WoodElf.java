package DesignPatterns.ChooseRace.Elf;

import DesignPatterns.ChooseRace.Race;

public class WoodElf extends Race {
    name = "Wood Elf";
    raceAbilityScoreMod[4] += 1;
    traits.add("Elf Weapon Training");
    traits.add("Fleet of Foot");
    traits.add("Mask of the Wild");
    languages.add("Extra Language");
    hpMod += 1;
}
