package DesignPatterns.AnnualRetreat.Entertainment;

public class Museum extends TourItem {
    @Override
    public int price() {
        return 25;
    }

    @Override
    public String name() {
        return "Museum";
    }
    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description () {
        return "Visit the local national museum";
    }
}