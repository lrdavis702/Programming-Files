// Concrete class that extends LunchItem (overwrites values
//in variables)

package DesignPatterns.AnnualRetreat.Food;

public class Regular extends LunchItem {
    @Override
    public int price() {
        return 5;
    }

    @Override
    public String name() {
        return "Standard Lunch";
    }

    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description() {
        return "Tasty buffet selection";
    }
}