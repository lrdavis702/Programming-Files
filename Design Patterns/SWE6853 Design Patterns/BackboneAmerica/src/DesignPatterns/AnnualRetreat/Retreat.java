// Retreat class with Item objects
package DesignPatterns.AnnualRetreat;

import java.util.ArrayList;
import java.util.List;

public class Retreat {
    private List<Item> options = new ArrayList<Item>();

    // adds items to array
    public void addItem(Item option) {
        options.add(option);
    }

    // gets total cost of options
    public int getCost() {
        int cost = 0;

        for (Item option : options) cost += option.price();

        return cost;
    }

    // displays items selected in retreat with price
    public void showItems(){
        System.out.println("***Itemized Retreat Package***");
        System.out.println("------------------------------");

        for (Item option : options) {
            System.out.println("Option: " + option.name() + " -- $" + option.price());
        }
    }
}
