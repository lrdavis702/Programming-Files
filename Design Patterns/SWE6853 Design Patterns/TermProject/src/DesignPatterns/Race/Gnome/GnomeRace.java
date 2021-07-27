package DesignPatterns.Race.Gnome;

import DesignPatterns.Race.RaceFactory;
import DesignPatterns.Race.Race;

import java.util.Scanner;

public class GnomeRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race chooseSubrace(String subrace){
        int min = 40;
        int max = 500;
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

        if (ch == 1) return new RockGnome();
        else if(ch == 2) return new ForestGnome();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("1: Rock Gnome");
        System.out.println("2: Forest Gnome");
        System.out.println("Select a Gnome subrace: ");
    }
}
