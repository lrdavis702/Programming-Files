package DesignPatterns.ChooseRace.Elf;

import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;
import java.util.Scanner;

public class ElfRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race createRace(String subrace){
        int min = 100;
        int max = 750;
        String entry;

        age = (int)((Math.random() * (max/2 - min) + 1) + min);
        raceAbilityScoreMod[1] += 2;
        size = "Medium";
        speed = 30;
        traits.add("Darkvision");
        traits.add("Keen Senses");
        traits.add("Fey Ancestry");
        traits.add("Trance");
        langauges.add("Common");
        languages.add("Elvish");
        
        do {
            subraceMenu();
            entry = input.nextLine();
            subrace = entry.charAt(0);

            if (subrace < 1 || subrace > 3) {
                System.out.println("ERROR: Please choose a valid option (0-9)");
            }
        } while (subrace < 1 || subrace > 3);

        if (subrace.equals(1)) return new HighElf();
        else if(subrace.equals(2)) return new DarkElf();
        else if(subrace.equals(3)) return new WoodElf();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("1: High Elf");
        System.out.println("2: Dark Elf");
        System.out.println("3: Wood Elf");
        System.out.println("Select an Elf subrace: ");
    }
}
