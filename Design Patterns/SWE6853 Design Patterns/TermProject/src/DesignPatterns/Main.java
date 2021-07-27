package DesignPatterns;

import DesignPatterns.Race.ChooseRace;
import DesignPatterns.Class.ChooseClass;
import DesignPatterns.Scores.DetermineAbilityScores;
import DesignPatterns.Description.DescribeCharacter;
import DesignPatterns.Equipment.ChooseEquipment;

public class Main {

    public static void main(String[] args) {
        System.out.println("This wizard will take you through the process of");
        System.out.println("creating a character for Dungeons and Dragons");
        System.out.println("This is a 5-step process which includes the following");
        System.out.println("Step 1: Choose a Race");
        System.out.println("Step 2: Choose a Class");
        System.out.println("Step 3: Determine Abilities");
        System.out.println("Step 4: Describe Your Character");
        System.out.println("Step 5: Choose Equipment");

        new ChooseRace();
        new ChooseClass();
        new DetermineAbilityScores();
        new DescribeCharacter();
        new ChooseEquipment();
    }
}