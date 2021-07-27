package DesignPatterns.ChooseRace.HalfElf;

import DesignPatterns.ChooseLanguage;
import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;
import java.util.Scanner;

public class HalfElfRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race createRace(String subrace) {
        int min = 15;
        int max = 80;

        age = (int) ((Math.random() * (max / 2 - min) + 1) + min);
        raceAbilityScoreMod[5] += 2;
        raceAbilityScoreMod[selectTrait(chooseAbility())] += 1;
        raceAbilityScoreMod[selectTrait(chooseAbility())] += 1;

        size = "Medium";
        speed = 30;
        traits.add("Darkvision");
        traits.add("Fey Ancestry");
        traits.add("Skill Versatility");
        languages.add("Common");
        languages.add("Elvish");
        languages.add(new ChooseLanguage());

        return null;
    }

    private void chooseAbility() {
        String entry = "x";
        char selection;

        do {
            abilityMenu();
            entry = input.nextLine();
            selection = entry.charAt(0);

            if (selection < 1 || selection > 6) {
                System.out.println("ERROR: Please choose a valid option (0-9)");
            }
        } while (selection < 0 || selection > 9);

        abilitySelection(selection);
    }

    private String

    int abilitySelection(char selection) {
        if (selection == 1) return 0;
        else if (selection == 2) return 1;
        else if (selection == 3) return 2;
        else if (selection == 4) return 3;
        else if (selection == 5) return 4;
        else if (selection == 6) return 5;
    }

    private void abilityMenu() {
        System.out.println("1: Strength");
        System.out.println("2: Dexterity");
        System.out.println("3: Constitution");
        System.out.println("4: Intelligence");
        System.out.println("5: Wisdom");
        System.out.println("6: Charisma");
        System.out.println("\n Choose an ability to improve: ");
    }

}