// Concrete class that extends BreakoutItem (overwrites values
//in variables

package DesignPatterns.AnnualRetreat.Breakout;

public class Networking extends BreakoutItem {
    @Override
    public int price() {
        return 299;
    }

    @Override
    public String name() {
        return "Networking";
    }

    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description () {
        return "Network with fellow business owners";
    }
}