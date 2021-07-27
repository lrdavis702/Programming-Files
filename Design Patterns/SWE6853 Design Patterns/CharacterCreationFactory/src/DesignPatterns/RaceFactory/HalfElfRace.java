package DesignPatterns.RaceFactory;

import DesignPatterns.CreateCharacter;
import DesignPatterns.RaceFactory.HalfElf.HalfElfDefault;

public class HalfElfRace extends RaceFactory {
    Race createRace(String item) {
        return new HalfElfDefault();
    }
}