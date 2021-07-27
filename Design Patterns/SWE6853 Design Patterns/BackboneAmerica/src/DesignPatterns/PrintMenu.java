package DesignPatterns;

import java.util.Scanner;

public class PrintMenu {
    public static char makeSelection(String[] list, String title) {
        Scanner input = new Scanner(System.in);
        String entry = "x";
        int selection;

        // allows user to select a race
        do {
            displayMenu(list, title);
            entry = input.nextLine();
            selection = entry.charAt(0) - '0';

            if (selection == 0) {
                System.out.println("Exiting System");
                System.exit(0);

            } else if (selection < 1 || selection > (list.length)) {
                System.out.println("\n\nERROR: Please choose a valid option (1-" + (list.length) + ")");
            }
        } while (selection < 1 || selection > (list.length));

        // calls the raceSelection method to choose a race
        return (char) (selection + '0');
    }

    public static void displayMenu(String[] menuList, String menuTitle) {
        System.out.println("\n\n***" + menuTitle + "***");
        System.out.println("Make your selection from the options below");

        for (int i = 0; i < menuList.length; i++) {
            System.out.println("|" + (i + 1) + "| " + menuList[i]);
        }
        System.out.println("|" + ('0') + "| Exit System\n");
        System.out.print("Make a selection: ");
    }
}