// abstract class that implements the Item interface. Creates new
// Planner type for the lunch and price

package DesignPatterns.AnnualRetreat.Food;

import DesignPatterns.AnnualRetreat.Item;
import DesignPatterns.AnnualRetreat.Planner;

public abstract class LunchItem implements Item {
    @Override
    public Planner planner() {
        return new FoodType();
    }

    @Override
    public abstract int price();
}