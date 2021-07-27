package DesignPatterns.Race;

import DesignPatterns.Race.Dragonborn.DragonbornRace;
import DesignPatterns.Race.Dwarf.DwarfRace;
import DesignPatterns.Race.Elf.ElfRace;
import DesignPatterns.Race.Gnome.GnomeRace;
import DesignPatterns.Race.HalfElf.HalfElfRace;
import DesignPatterns.Race.HalfOrc.HalfOrcRace;
import DesignPatterns.Race.Halfling.HalflingRace;
import DesignPatterns.Race.Human.HumanRace;
import DesignPatterns.Race.Tiefling.TieflingRace;

import java.util.Scanner;

public class ChooseRace {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String entry = "x";
        char selection;

        // allows user to select a race
        do{
            raceMenu();
            entry = input.nextLine();
            selection = entry.charAt(0);

            if (selection < 0 || selection > 9){
                System.out.println("ERROR: Please choose a valid option (0-9)");
            }
        } while (selection < 0 || selection > 9);

        // calls the raceSelection method to choose a race
        raceSelection(selection);

        // this is where to select the subrace
    }

    /* creates a race based upon the user's selection: Dwarf, Elf, Halfling,
    Human, Dragonborn, Gnome, Half-Elf, Half-Orc, or Tiefling.
    Calls chooseSubrace method for each race, which allows users to
    choose a subrace.
     */
    private static void raceSelection(char selection) {
        if (selection == 1) {
            RaceFactory dwarf = new DwarfRace();
            Race race = dwarf.chooseSubrace();
        }
        else if (selection == 2) {
            RaceFactory elf = new ElfRace();
            //Race race = elf.chooseSubrace(subrace);
        }
        else if (selection == 3) {
            RaceFactory halfling = new HalflingRace();
            //Race race = halfling.chooseSubrace(subrace);
        }
        else if (selection == 4) {
            RaceFactory human = new HumanRace();
            //Race race = human.chooseSubrace(subrace);
        }
        else if (selection == 5) {
            RaceFactory dragonborn = new DragonbornRace();
            //Race race = dragonborn.chooseSubrace(subrace);
        }
        else if (selection == 6) {
            RaceFactory gnome = new GnomeRace();
           // Race race = gnome.chooseSubrace(subrace);
        }
        else if (selection == 7) {
            RaceFactory halfElf = new HalfElfRace();
          //  Race race = halfElf.chooseSubrace(subrace);
        }
        else if (selection == 8) {
            RaceFactory halfOrc = new HalfOrcRace();
            //Race race = halfOrc.chooseSubrace(subrace);
        }
        else if (selection == 9) {
            RaceFactory tiefling = new TieflingRace();
           // Race race = tiefling.chooseSubrace(subrace);
        }
    }

    // displays menu of races
    private static void raceMenu() {
        System.out.println("1: Dwarf");
        System.out.println("2: Elf");
        System.out.println("3: Hafling");
        System.out.println("4: Human");
        System.out.println("5: Dragonborn");
        System.out.println("6: Gnome");
        System.out.println("7: Half-Elf");
        System.out.println("8: Half-Orc");
        System.out.println("9: Tiefling");
        System.out.println("0: Exit");
        System.out.println("\n Choose a race: ");
    }
}
