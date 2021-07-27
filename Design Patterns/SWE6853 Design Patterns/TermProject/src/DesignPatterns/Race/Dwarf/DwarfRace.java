package DesignPatterns.Race.Dwarf;

import DesignPatterns.Race.RaceFactory;
import DesignPatterns.Race.Race;

import java.util.Scanner;

public class DwarfRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race chooseSubrace(){
        int min = 50;
        int max = 350;
        String entry;
        char ch;

        do {
            subraceMenu();
            entry = input.nextLine();
            ch = entry.charAt(0);

            if (ch < 0 || ch > 2) {
                System.out.println("ERROR: Please choose a valid option (1-2)");
            }
        } while (ch < 0 || ch > 2);

        if (ch == 1) return new HillDwarf();
        else if(ch == 2) return new MountainDwarf();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("1: Hill Dwarf");
        System.out.println("2: Mountain Dwarf");
        System.out.println("Select a Dwarf subrace: ");
    }
}
