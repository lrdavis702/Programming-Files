// Concrete class that implement the planner interface

package DesignPatterns.AnnualRetreat.Food;

import DesignPatterns.AnnualRetreat.Planner;

public class FoodType implements Planner {
    @Override
    public String plan(){
        return "Lunch Selection";
    }
}