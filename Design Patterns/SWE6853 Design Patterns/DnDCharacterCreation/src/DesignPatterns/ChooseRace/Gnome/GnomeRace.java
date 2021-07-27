package DesignPatterns.ChooseRace.Gnome;

import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;
import java.util.Scanner;

public class GnomeRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race createRace(String subrace){
        int min = 40;
        int max = 500;
        String entry;

        age = (int)((Math.random() * (max/2 - min) + 1) + min);
        raceAbilityScoreMod[3] += 2;
        size = "small";
        speed = 25;
        traits.add("Darkvision");
        traits.add("Gnome Cunning");
        langauges.add("Common");
        languages.add("Gnomish");

        do {
            subraceMenu();
            entry = input.nextLine();
            subrace = entry.charAt(0);

            if (subrace < 1 || subrace > 2) {
                System.out.println("ERROR: Please choose a valid option (1-2)");
            }
        } while (subrace < 1 || subrace > 2);

        if (subrace.equals("Rock")) return new RockGnome();
        else if(subrace.equals("Forest")) return new ForestGnome();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("1: Rock Gnome");
        System.out.println("2: Forest Gnome");
        System.out.println("Select a Gnome subrace: ");
    }
}
