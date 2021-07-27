package DesignPatterns.Race;

public abstract class RaceFactory {
    abstract Race createRace(String item);

    public Race chooseSubrace(String type) {
        Race race = createRace(type);
        System.out.println("--- Configuring " + race.getName() + " ---");
        race.abilityMods();
        race.languages();
        race.age();
        race.prepare();
        race.alignment();

        return race;
    }
}
