package DesignPatterns;

import java.util.Scanner;

public class ChooseLanguage {
    static Scanner input = new Scanner(System.in);

    public static Object chooseLanguage() {
        String entry = "x";
        char selection;

        do {
            languageMenu();
            entry = input.nextLine();
            selection = entry.charAt(0);

            if (selection < 0 || selection > 9) {
                System.out.println("ERROR: Please choose a valid option (0-9)");
            }
        } while (selection < 0 || selection > 9);

        languageSelection(selection);
    }

    static String languageSelection(char selection) {
        if (selection == 1) return "Dwarvish";
        else if (selection == 2) return "Elfish";
        else if (selection == 3) return "Giant";
        else if (selection == 4) return "Gnomish";
        else if (selection == 5) return "Infernal";
        else if (selection == 6) return "Halfling";
        else if (selection == 7) return "Orc";
        else if (selection == 8) return "Draconic";
        else if (selection == 9) return "Other";
    }

    private static void languageMenu() {
        System.out.println("1: Dwarvish");
        System.out.println("2: Elvish");
        System.out.println("3: Giant");
        System.out.println("4: Gnomish");
        System.out.println("5: Infernal");
        System.out.println("6: Halfling");
        System.out.println("7: Orc");
        System.out.println("8: Draconic");
        System.out.println("9: Other");
        System.out.println("0: Exit");
        System.out.println("\n Choose one additional language: ");
    }
}
