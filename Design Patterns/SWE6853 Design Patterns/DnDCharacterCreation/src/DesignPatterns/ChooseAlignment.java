package DesignPatterns.ChooseRace;

import java.util.Scanner;

public class ChooseAlignment {
    static Scanner input = new Scanner(System.in);

    public static Object chooseMorality() {
        String entry = "x";
        char selection;

        do {
            moralityMenu();
            entry = input.nextLine();
            selection = entry.charAt(0);

            if (selection < 1 || selection > 3) {
                System.out.println("ERROR: Please choose a valid option (1-3)");
            }
        } while (selection < 1 || selection > 3);

        moralitySelection(selection);
    }

    static String moralitySelection(char selection) {
        if (selection == 1) return "Good";
        else if (selection == 2) return "Evil";
        else if (selection == 3) return "Neutral";
    }

    private static void moralityMenu() {
        System.out.println("1: Good");
        System.out.println("2: Evil");
        System.out.println("3: Neutral");
        System.out.println("0: Exit");
        System.out.println("\n Choose an Alignment Morality: ");
    }

    public static Object chooseAttitude() {
        String entry = "x";
        char selection;

        do {
            moralityMenu();
            entry = input.nextLine();
            selection = entry.charAt(0);

            if (selection < 1 || selection > 3) {
                System.out.println("ERROR: Please choose a valid option (1-3)");
            }
        } while (selection < 1 || selection > 3);

        attitudeSelection(selection);
    }

    static String attitudeSelection(char selection) {
        if (selection == 1) return "Lawful";
        else if (selection == 2) return "Chaotic";
        else if (selection == 3) return "Neutral";
    }

    private static void attitudeMenu() {
        System.out.println("1: Lawful");
        System.out.println("2: Chaotic");
        System.out.println("3: Neutral");
        System.out.println("0: Exit");
        System.out.println("\n Choose an Alignment Morality: ");
    }
}