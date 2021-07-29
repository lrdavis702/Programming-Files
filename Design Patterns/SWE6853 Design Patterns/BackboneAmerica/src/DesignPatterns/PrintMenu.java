// Class to print all menus in program
package DesignPatterns;

import java.util.Scanner;

public class PrintMenu {
    // uses the list of menu options and the title from classes
    public static char makeSelection(String[] list, String title) {
        Scanner input = new Scanner(System.in);
        String entry = "x";
        int selection;

        do {
            displayMenu(list, title);
            entry = input.nextLine();
            selection = entry.charAt(0) - '0';

            // exits system if user chooses 0
            if (selection == 0) {
                System.out.println("Exiting System");
                System.exit(0);

                // gives error message if user input not an option
            } else if (selection < 1 || selection > (list.length)) {
                System.out.println("\n\nERROR: Please choose a valid option (1-" + (list.length) + ")");
            }
        } while (selection < 1 || selection > (list.length));

        // calls the raceSelection method to choose a race
        return (char) (selection + '0');
    }

    // displays menu based on menu options from class
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