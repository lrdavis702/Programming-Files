package DesignPatterns.Race.Elf;

import DesignPatterns.Race.RaceFactory;
import DesignPatterns.Race.Race;

import java.util.Scanner;

public class ElfRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race chooseSubrace(String subrace){
        int min = 100;
        int max = 750;
        String entry;
        char ch;

        do {
            subraceMenu();
            entry = input.nextLine();
            ch = entry.charAt(0);

            if (ch < 1 || ch > 3) {
                System.out.println("ERROR: Please choose a valid option (0-9)");
            }
        } while (ch < 1 || ch > 3);

        if (ch == 1) return new HighElf();
        else if(ch == 2) return new DarkElf();
        else if(ch == 3) return new WoodElf();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("1: High Elf");
        System.out.println("2: Dark Elf");
        System.out.println("3: Wood Elf");
        System.out.println("Select an Elf subrace: ");
    }
}
