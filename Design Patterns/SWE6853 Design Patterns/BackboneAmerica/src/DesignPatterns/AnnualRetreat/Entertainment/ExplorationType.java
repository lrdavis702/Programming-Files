// Concrete class that implement the planner interface

package DesignPatterns.AnnualRetreat.Entertainment;

import DesignPatterns.AnnualRetreat.Planner;

public class ExplorationType implements Planner {
    @Override
    public String plan(){
        return "City Tour";
    }
}
