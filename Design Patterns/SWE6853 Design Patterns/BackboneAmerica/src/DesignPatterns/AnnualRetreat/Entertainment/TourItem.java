package DesignPatterns.AnnualRetreat.Entertainment;

import DesignPatterns.AnnualRetreat.Item;
import DesignPatterns.AnnualRetreat.Planner;

public abstract class TourItem implements Item {
    @Override
    public Planner planner() {
        return new ExplorationType();
    }

    @Override
    public abstract int price();
}