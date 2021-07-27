package DesignPatterns.ChooseRace;

import java.util.ArrayList;

public abstract class Race {
    String alignment;
    String size;
    String name;
    int speed;
    int hpMod;
    int age;

    ArrayList raceAbilityScoresMod = new ArrayList();
    ArrayList languages = new ArrayList();
    ArrayList traits = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);

        System.out.println("Determining ability modifiers...");
        for (int i = 0; i < raceAbilityScoresMod.size(); i++) {
            System.out.println(" " + raceAbilityScoresMod.get(i));
        }

        System.out.println("Calculating age... "  + age + "years old.");
        System.out.println("Getting alignment... "  + alignment);
        System.out.println("Determining size... "  + size);

        System.out.println("Adding traits...");
        for (int i = 0; i < traits.size(); i++) {
            System.out.println(" " + traits.get(i));
        }

        System.out.println("Adding languages: ");
        for (int i = 0; i < languages.size(); i++){
            System.out.println(" " + languages.get(i));
        }
    }


    public int[] getRaceAbilityScoreMod() {
        return raceAbilityScoresMod;
    }

    public void setRaceAbilityScoreMod(int[] raceAbilityScoreMod) {
        // generates 7 random scores
        for (int arrayCount = 0; arrayCount < 6; arrayCount++) {
            int tempScore = 0; // initializes and sets score to 0

            // generate random numbers within 1 to 6
            for (int i = 0; i < 3; i++) {
                int rand = (int) (Math.random() * 6) + 1;
                tempScore += rand;
            }
            this.raceAbilityScoresMod[arrayCount] = tempScore; // adds score to array
        }
    }

    public ArrayList<String> getTraits() {
        return traits;
    }

    public void setTraits(ArrayList<String> traits) {
        this.traits = traits;
    }


    public String getSubrace() {
        return subrace;
    }

    public void setSubrace(String subrace) {
        this.subrace = subrace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public void initialize() {
        System.out.println("Initializing " + getName());
    }

    public String getName() {
        return name;
    }
}
