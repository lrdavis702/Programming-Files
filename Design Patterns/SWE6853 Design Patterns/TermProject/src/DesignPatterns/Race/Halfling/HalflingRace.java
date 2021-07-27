package DesignPatterns.Race.Halfling;

import DesignPatterns.Race.RaceFactory;
import DesignPatterns.Race.Race;

import java.util.Scanner;

public class HalflingRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race chooseSubrace(String subrace){
        int min = 20;
        int max = 200;
        String entry;
        char ch;

        do {
            subraceMenu();
            entry = input.nextLine();
            ch = entry.charAt(0);

            if (ch < 1 || ch > 2) {
                System.out.println("ERROR: Please choose a valid option (1-2)");
            }
        } while (ch < 1 || ch > 2);

        if (ch == 1) return new LightfootHalfling();
        else if (ch == 2) return new StoutHalfling();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("1: Lightfoot Halfling");
        System.out.println("2: Stout Halfling");
        System.out.println("Select a Halfling subrace: ");
    }
}
