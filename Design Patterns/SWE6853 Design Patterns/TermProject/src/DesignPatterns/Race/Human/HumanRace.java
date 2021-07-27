package DesignPatterns.Race.Human;

import DesignPatterns.Race.RaceFactory;
import DesignPatterns.Race.Race;

import java.util.Scanner;

public class HumanRace extends RaceFactory {
    static Scanner input = new Scanner(System.in);

    Race chooseSubrace(String subrace){
        int min = 18;
        int max = 115;
        String entry;
        char ch;

        do {
            subraceMenu();
            entry = input.nextLine();
            ch = entry.charAt(0);

            if (ch < 1 || ch > 9) {
                System.out.println("ERROR: Please choose a valid option (1-9)");
            }
        } while (ch < 1 || ch > 9);

        if (ch == 1) return new CalishiteHuman();
        else if (ch == 2) return new ChondathanHuman();
        else if (ch == 3) return new DamaranHuman();
        else if (ch == 4) return new IlluskanHuman();
        else if (ch == 5) return new MulanHuman();
        else if (ch == 6) return new RashemiHuman();
        else if (ch == 7) return new ShouHuman();
        else if (ch == 8) return new TethyrianHuman();
        else if (ch == 9) return new TuramiHuman();
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
