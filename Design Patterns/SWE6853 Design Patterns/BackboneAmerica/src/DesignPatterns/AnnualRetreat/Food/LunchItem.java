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