package DesignPatterns.ChooseRace.Dwarf;

import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;
import java.util.Scanner;

public class DwarfRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race createRace(String subrace){
        int min = 50;
        int max = 350;
        String entry;

        age = (int)((Math.random() * (max/2 - min) + 1) + min);
        raceAbilityScoreMod[2] += 2;
        size = "Medium";
        speed = 25;
        traits.add("Darkvision");
        traits.add("Dwarven Resilence");
        traits.add("Dwarven Combat Training");
        traits.add("Tool Proficiency");
        traits.add("Stone Cutting");
        langauges.add("Common");
        languages.add("Dwarven");

        do {
            subraceMenu();
            entry = input.nextLine();
            subrace = entry.charAt(0);

            if (subrace < 0 || subrace > 2) {
                System.out.println("ERROR: Please choose a valid option (1-2)");
            }
        } while (subrace < 0 || subrace > 2);

        if (subrace.equals(1)) return new HillDwarf();
        else if(subrace.equals(2)) return new MountainDwarf();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("1: Hill Dwarf");
        System.out.println("2: Mountain Dwarf");
        System.out.println("Select a Dwarf subrace: ");
    }
}
