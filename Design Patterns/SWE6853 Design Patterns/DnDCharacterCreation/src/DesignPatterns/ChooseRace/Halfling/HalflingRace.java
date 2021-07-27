package DesignPatterns.ChooseRace.Halfling;

import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;
import java.util.Scanner;

public class HalflingRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race createRace(String subrace) {
        int min = 20;
        int max = 200;
        String entry;

        age = (int) ((Math.random() * (max / 2 - min) + 1) + min);
        raceAbilityScoreMod[1] += 2;
        size = "Small";
        speed = 25;
        traits.add("Lucky");
        traits.add("Brave");
        traits.add("Halfling Nimbleness");
        langauges.add("Common");
        languages.add("Halfling");

        do {
            subraceMenu();
            entry = input.nextLine();
            subrace = entry.charAt(0);

            if (subrace < 1 || subrace > 2) {
                System.out.println("ERROR: Please choose a valid option (1-2)");
            }
        } while (subrace < 1 || subrace > 2);

        if (subrace.equals("Lightfoot")) return new LightfootHalfling();
        else if (subrace.equals("Stout")) return new StoutHalfling();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("0: Lightfoot Halfling");
        System.out.println("1: Stout Halfling");
        System.out.println("Select a Halfling subrace: ");
    }
}