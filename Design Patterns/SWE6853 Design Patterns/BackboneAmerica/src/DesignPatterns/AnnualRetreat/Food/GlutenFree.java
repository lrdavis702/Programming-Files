package DesignPatterns.AnnualRetreat.Food;

public class GlutenFree extends LunchItem {
    @Override
    public int price() {
        return 0;
    }

    @Override
    public String name() {
        return "Gluten Free Lunch";
    }

    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description() {
        return "Delicious Gluten-Free meal.";
    }
}