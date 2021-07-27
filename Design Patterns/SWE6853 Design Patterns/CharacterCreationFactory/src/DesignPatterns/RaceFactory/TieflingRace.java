package DesignPatterns.RaceFactory;

import DesignPatterns.RaceFactory.Tiefling.TielflingDefault;

public class TieflingRace extends RaceFactory {
    Race createRace(String item) {
        return new TielflingDefault();
    }
}