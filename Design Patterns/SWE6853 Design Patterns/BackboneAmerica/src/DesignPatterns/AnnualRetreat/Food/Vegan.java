// Concrete class that extends LunchItem (overwrites values
//in variables)

package DesignPatterns.AnnualRetreat.Food;

public class Vegan extends LunchItem {
    @Override
    public int price() {
        return 5;
    }

    @Override
    public String name() {
        return "Vegan Lunch";
    }

    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description() {
        return "All the veggies you can eat";
    }
}