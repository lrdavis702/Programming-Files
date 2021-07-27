package DesignPatterns.AnnualRetreat;

import java.util.ArrayList;
import java.util.List;

public class Retreat {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
    }

    public int getCost() {
        int cost = 0;

        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println("Item : " + item.name());
            System.out.println(", Planner : " + item.planner().plan());
            System.out.println(", Price: " + item.price());
        }
    }
}
