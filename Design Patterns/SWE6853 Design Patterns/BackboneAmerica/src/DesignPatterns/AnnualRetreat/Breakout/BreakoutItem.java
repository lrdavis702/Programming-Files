package DesignPatterns.AnnualRetreat.Breakout;

import DesignPatterns.AnnualRetreat.Item;
import DesignPatterns.AnnualRetreat.Planner;

public abstract class BreakoutItem implements Item {
    @Override
    public Planner planner() {
        return new DevelopmentType();
    }

    @Override
    public abstract int price();
}

