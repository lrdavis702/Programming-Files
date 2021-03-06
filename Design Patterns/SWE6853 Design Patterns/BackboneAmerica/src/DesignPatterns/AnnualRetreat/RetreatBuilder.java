// Builder class for creating the Retreat
package DesignPatterns.AnnualRetreat;

import DesignPatterns.AnnualRetreat.Breakout.BusinessSetup;
import DesignPatterns.AnnualRetreat.Food.LunchItem;
import DesignPatterns.PrintMenu;
import DesignPatterns.AnnualRetreat.Breakout.GoalSetting;
import DesignPatterns.AnnualRetreat.Breakout.Networking;
import DesignPatterns.AnnualRetreat.Breakout.Projections;
import DesignPatterns.AnnualRetreat.Entertainment.AmusementPark;
import DesignPatterns.AnnualRetreat.Entertainment.Museum;
import DesignPatterns.AnnualRetreat.Entertainment.NatureWalk;
import DesignPatterns.AnnualRetreat.Food.GlutenFree;
import DesignPatterns.AnnualRetreat.Food.Regular;
import DesignPatterns.AnnualRetreat.Food.Vegan;

public class RetreatBuilder {
    public Retreat prepareRetreat() {
        System.out.println("***Build Your Retreat***");

        Retreat retreat = new Retreat();

        // adds options to the retreat
        retreat.addItem(selectSession());
        retreat.addItem(selectMeal());
        retreat.addItem(selectEntertainment());

        return retreat;
    }

    // allows the user to select entertainment from menu
    private Item selectEntertainment() {
        String[] entertainmentArray = new String[]{"Amusement Park", "Museum", "Nature Walk"};
        String entertainmentTitle = "City Tour";

        char item;

        System.out.println("Choose an entertainment option");

        // gets selection from user
        item = PrintMenu.makeSelection(entertainmentArray, entertainmentTitle);

        if (item == '1') return new AmusementPark();
        else if (item == '2') return new Museum();
        else if (item == '3') return new NatureWalk();
        else return null;
    }

    // allows the user to select lunch option from menu
    private Item selectMeal() {
        String[] lunchArray = new String[]{"Standard Meal", "Gluten-Free Meal", "Vegan Meal"};
        String lunchTitle = "Lunch Menu";

        char item;

        System.out.println("Choose a lunch option");

        // gets selection from user
        item = PrintMenu.makeSelection(lunchArray, lunchTitle);

        if (item == '1') return new Regular();
        else if (item == '2') return new GlutenFree();
        else if (item == '3') return new Vegan();
        else return null;
    }

    // allows the user to select breakout session from menu
    private Item selectSession() {
        String[] sessionArray = new String[]{"Business Setup", "Goal Setting", "Networking",
                "Financial Projections"};
        String sessionTitle = "Breakout Session";

        char item;

        System.out.println("Select a Breakout Session");

        // gets selection from user
        item = PrintMenu.makeSelection(sessionArray, sessionTitle);

        if (item == '1') return new BusinessSetup();
        else if (item == '2') return new GoalSetting();
        else if (item == '3') return new Networking();
        else if (item == '4') return new Projections();
        else return null;
    }
}