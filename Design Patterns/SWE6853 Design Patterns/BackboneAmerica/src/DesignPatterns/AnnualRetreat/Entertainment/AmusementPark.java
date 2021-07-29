// Concrete class that extends TourItem (overwrites values
//in variables)

package DesignPatterns.AnnualRetreat.Entertainment;

public class AmusementPark extends TourItem {
    @Override
    public int price() {
        return 50;
    }

    @Override
    public String name() {
        return "Amusement Park";
    }

    @Override
    public int sessions() {
        return 1;
    }

    @Override
    public String description () {
        return "Thrills and excitement at the amusement park";
    }
}