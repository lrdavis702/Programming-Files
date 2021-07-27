package DesignPatterns;

import DesignPatterns.RaceFactory.*;

import java.util.Scanner;

public class CreateCharacter {
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
      String[] raceArray = new String[]{"Dwarf", "Elf", "Halfling", "Human",
              "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tielflng"};
      String menuTitle = "Choose Race";
      char userChoice;

      userChoice = makeSelection(raceArray, menuTitle);

      if (userChoice == 1) {
         RaceFactory dwarf = new DwarfRace();
        // Race race = dwarf.configRace("Hill");
      }
      else if (userChoice == 2) {
         RaceFactory elf = new ElfRace();
         //Race race = elf.chooseSubrace(subrace);
      }
      else if (userChoice == 3) {
         RaceFactory halfling = new HalflingRace();
         //Race race = halfling.chooseSubrace(subrace);
      }
      else if (userChoice == 4) {
         RaceFactory human = new HumanRace();
         //Race race = human.chooseSubrace(subrace);
      }
      else if (userChoice == 5) {
         RaceFactory dragonborn = new DragonbornRace();
         //Race race = dragonborn.chooseSubrace(subrace);
      }
      else if (userChoice == 6) {
         RaceFactory gnome = new GnomeRace();
         //Race race = gnome.chooseSubrace(subrace);
      }
      else if (userChoice == 7) {
         RaceFactory halfElf = new HalfElfRace();
         //Race race = halfElf.chooseSubrace(subrace);
      }
      else if (userChoice == 8) {
         RaceFactory halfOrc = new HalfOrcRace();
         //Race race = halfOrc.chooseSubrace(subrace);
      }
      else if (userChoice == 9) {
         RaceFactory tiefling = new TieflingRace();
         //Race race = tiefling.chooseSubrace(subrace);
      }
   }

   public static char makeSelection(String[] stringArray, String stringT) {
      String entry = "x";
      char selection;

      // allows user to select a race
      do {
         displayMenu(stringArray, stringT);
         entry = input.nextLine();
         selection = entry.charAt(0);

         if (selection < '1' && selection > (stringArray.length)) {
            System.out.println("ERROR: Please choose a valid option (1-" + (stringArray.length) + ")");
         }
      } while (selection < '1' && selection > (stringArray.length));

      // calls the raceSelection method to choose a race
      return selection;
   }

   public static void displayMenu(String[] stringArray, String stringT){
      System.out.println("***" + stringT + "***");
      for(int i = 0; i < stringArray.length; i++){
            System.out.println((i + 1) + ": " + stringArray[i]);
         }
      System.out.print("Make a selection: ");
   }
}
