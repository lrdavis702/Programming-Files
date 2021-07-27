package DesignPatterns.RaceFactory;

import DesignPatterns.RaceFactory.HalfElf.HalfElfDefault;
import DesignPatterns.RaceFactory.HalfOrc.HalfElfOrcDefault;

public class HalfOrcRace extends RaceFactory {
    Race createRace(String item) {
        return new HalfElfOrcDefault();
    }
}