package DesignPatterns.ChooseRace.Dragonborn;
import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;

import java.util.Scanner;

public class DragonbornRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race createRace(String subrace){
        int min = 15;
        int max = 80;
        String entry;

        age = (int)((Math.random() * (max/2 - min) + 1) + min);
        raceAbilityScoreMod[0] += 2;
        raceAbilityScoreMod[5] +=1;
        size = "Medium";
        speed = 30;
        traits.add("Draconic Ancestry");
        langauges.add("Common");
        languages.add("Draconic");

        do {
            subraceMenu();
            entry = input.nextLine();
            subrace = entry.charAt(0);

            if (subrace < 0 || subrace > 9) {
                System.out.println("ERROR: Please choose a valid option (0-9)");
            }
        } while (subrace < 0 || subrace > 9);

        if (subrace(0)) return new BlackDragon();
        else if(subrace(1)) return new BlueDragon();
        else if(subrace(2)) return new BrassDragon();
        else if(subrace(3)) return new BronzeDragon();
        else if(subrace(4)) return new CopperDragon();
        else if(subrace(5)) return new GoldDragon();
        else if(subrace(6)) return new GreenDragon();
        else if(subrace(7)) return new RedDragon();
        else if(subrace(8)) return new SilverDragon();
        else if(subrace(9)) return new WhiteDragon();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("0: Black Dragon");
        System.out.println("1: Blue Dragon");
        System.out.println("2: Brass Dragon");
        System.out.println("3: Bronze Dragon");
        System.out.println("4: Copper Dragon");
        System.out.println("5: Gold Dragon");
        System.out.println("6: Green Dragon");
        System.out.println("7: Red Dragon");
        System.out.println("8: Silver Dragon");
        System.out.println("9: White Dragon");
        System.out.println("Select a Dragonborn subrace: ");
    }
}
