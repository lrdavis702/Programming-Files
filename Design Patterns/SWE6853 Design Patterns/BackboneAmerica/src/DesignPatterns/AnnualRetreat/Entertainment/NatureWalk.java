package DesignPatterns.AnnualRetreat.Entertainment;

public class NatureWalk extends TourItem {
    @Override
    public int price() {
        return 0;
    }

    @Override
    public String name() {
        return "Nature Walk";
    }
    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description () {
        return "Get fresh air at the local national park";
    }
}