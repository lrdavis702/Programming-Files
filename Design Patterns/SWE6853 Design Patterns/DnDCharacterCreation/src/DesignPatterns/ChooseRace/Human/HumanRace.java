package DesignPatterns.ChooseRace.Human;

import DesignPatterns.ChooseRace.Race;
import DesignPatterns.RaceFactory;
import DesignPatterns.ChooseLanguage;
import java.util.Scanner;

public class HumanRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race createRace(String subrace) {
        int min = 18;
        int max = 115;
        String entry;

        age = (int) ((Math.random() * (max / 2 - min) + 1) + min);
        for (int i = 0; i < raceAbilityScore.length; i++) {
            raceAbilityScoreMod[i] += 1;
        }
        size = "Medium";
        speed = 30;
        langauges.add("Common");
        languages.add(new ChooseLanguage());

        do {
            subraceMenu();
            entry = input.nextLine();
            subrace = entry.charAt(0);

            if (subrace < 1 || subrace > 9) {
                System.out.println("ERROR: Please choose a valid option (1-9)");
            }
        } while (subrace < 1 || subrace > 9);

        if (subrace.equals(1)) return new CalishiteHuman();
        else if (subrace.equals(2)) return new ChondathanHuman();
        else if (subrace.equals(3)) return new DamaranHuman();
        else if (subrace.equals(4)) return new IlluskanHuman();
        else if (subrace.equals(5)) return new MulanHuman();
        else if (subrace.equals(6)) return new RashemiHuman();
        else if (subrace.equals(7)) return new ShouHuman();
        else if (subrace.equals(8)) return new TethyrianHuman();
        else if (subrace.equals(9)) return new TuramiHuman();
        else return null;
    }

    private void subraceMenu() {
        System.out.println("1: Calishite Human");
        System.out.println("2: Chondathan Human");
        System.out.println("3: Damaran Human");
        System.out.println("4: Illuskan Human");
        System.out.println("5: Mulan Human");
        System.out.println("6: Rashemi Human");
        System.out.println("7: Shou Human");
        System.out.println("8: Tethyrian Human");
        System.out.println("9: Turami Human");
        System.out.println("Select a Human subrace: ");
    }
}


