// abstract class that implements the Item interface. Creates new
// Planner type for the tour and price

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