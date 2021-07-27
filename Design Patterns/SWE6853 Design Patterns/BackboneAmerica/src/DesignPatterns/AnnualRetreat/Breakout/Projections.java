package DesignPatterns.AnnualRetreat.Breakout;

public class Projections extends BreakoutItem {
    @Override
    public int price() {
        return 299;
    }

    @Override
    public String name() {
        return "Financial Projections";
    }

    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description() {
        return "Basic foundation of financial projections";
    }
}