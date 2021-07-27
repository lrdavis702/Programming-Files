package DesignPatterns.Race.Dragonborn;

import DesignPatterns.Race.RaceFactory;
import DesignPatterns.Race.Race;

import java.util.Scanner;

public class DragonbornRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race chooseSubrace(){
        int min = 15;
        int max = 80;
        String entry;
        char ch;

        do {
            subraceMenu();
            entry = input.nextLine();
            ch = entry.charAt(0);

            if (ch < 0 || ch > 9) {
                System.out.println("ERROR: Please choose a valid option (0-9)");
            }
        } while (ch < 0 || ch > 9);

        if (ch == 0 ) return new BlackDragon();
        else if(ch == 1) return new BlueDragon();
        else if(ch == 2) return new BrassDragon();
        else if(ch == 3) return new BronzeDragon();
        else if(ch == 4) return new CopperDragon();
        else if(ch == 5) return new GoldDragon();
        else if(ch == 6) return new GreenDragon();
        else if(ch == 7) return new RedDragon();
        else if(ch == 8) return new SilverDragon();
        else if(ch == 9) return new WhiteDragon();
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