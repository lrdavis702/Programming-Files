// abstract class that implements the Item interface. Creates new
// Planner type for the breakout session and price
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

