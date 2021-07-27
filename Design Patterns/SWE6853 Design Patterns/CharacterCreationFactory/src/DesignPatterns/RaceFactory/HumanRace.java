package DesignPatterns.RaceFactory;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.Human.*;

public class HumanRace extends RaceFactory {
    Race createRace(String item) {

        String[] raceArray = new String[]{"Calishite", "Chondathan", "Damaran",
                "Illuskan", "Mulan", "Rashemi", "Shou", "Tethyrian", "Turami"};
        String menuTitle = "Choose Subclass";
        char userChoice;

        userChoice = CreateCharacter.makeSelection(raceArray, menuTitle);

        if (userChoice == 1) {
            return new CalishiteHuman();
        } else if (userChoice == 2) {
            return new ChondathanHuman();
        } else if (userChoice == 3) {
            return new DamaranHuman();
        } else if (userChoice == 4) {
            return new IlluskanHuman();
        } else if (userChoice == 5) {
            return new MulanHuman();
        } else if (userChoice == 6) {
            return new RashemiHuman();
        } else if (userChoice == 7) {
            return new ShouHuman();
        } else if (userChoice == 8) {
            return new TethyrianHuman();
        } else if (userChoice == 9) {
            return new TuramiHuman();
        } else
            return null;
    }
}
