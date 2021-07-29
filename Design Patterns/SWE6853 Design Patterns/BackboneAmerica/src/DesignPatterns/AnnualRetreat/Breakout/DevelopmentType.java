// Concrete class that implement the planner interface
package DesignPatterns.AnnualRetreat.Breakout;

import DesignPatterns.AnnualRetreat.Planner;

public class DevelopmentType implements Planner {
    @Override
    public String plan(){
        return "Breakout Session";
    }
}
