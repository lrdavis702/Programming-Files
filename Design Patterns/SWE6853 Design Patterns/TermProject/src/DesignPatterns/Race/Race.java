package DesignPatterns.Race;

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

    public void abilityMods() {
    }

    public void languages() {
    }

    public void age() {
    }

    public void prepare() {
    }

    public void alignment() {
    }

    public String getName() {
        return name;
    }
}
