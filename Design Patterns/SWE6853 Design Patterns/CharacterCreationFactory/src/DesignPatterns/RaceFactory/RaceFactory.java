package DesignPatterns.RaceFactory;

public abstract class RaceFactory {
    abstract Race createRace(String item);

    public Race configRace(String type) {
        Race race = createRace(type);
        System.out.println("--- Generating a " + race.getName() + " ---");

        toString();
        return race;
    }
}
