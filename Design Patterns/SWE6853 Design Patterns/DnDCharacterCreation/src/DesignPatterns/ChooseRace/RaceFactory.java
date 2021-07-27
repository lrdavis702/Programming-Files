package DesignPatterns.ChooseRace;

import DesignPatterns.ChooseRace.Race;

public abstract class RaceFactory {

    public Race chooseRace(String type){
        Race race;

        race = createRace(type);

        race.initialize();

        return race;
    }

    protected abstract Race createRace (String type);
}
