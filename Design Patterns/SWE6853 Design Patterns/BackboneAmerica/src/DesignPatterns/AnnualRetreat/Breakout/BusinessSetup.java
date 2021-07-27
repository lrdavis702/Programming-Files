package DesignPatterns.AnnualRetreat.Breakout;

import DesignPatterns.AnnualRetreat.Item;

public class BusinessSetup extends BreakoutItem {
    @Override
    public int price() {
        return 299;
    }

    @Override
    public String name() {
        return "Business Setting";
    }

    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description() {
        return "Register your business";
    }
}
