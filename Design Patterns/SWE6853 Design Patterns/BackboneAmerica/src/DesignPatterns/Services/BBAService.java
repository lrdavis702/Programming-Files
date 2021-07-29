// BBA = BackboneAmerica. Abstract Service class for services

package DesignPatterns.Services;

import java.util.ArrayList;

public abstract class BBAService {
    protected String name;
    protected String description;
    protected int sessions;
    protected int price;
    protected ArrayList addons = new ArrayList();


    // visual steps for ordering services
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("\nDescription> \n" + description);
        System.out.println("*Includes> " + sessions + " sessions");
        System.out.print("**Free Bonuses> ");
        // adds free items to service package
        for (int i = 0; i < addons.size(); i++) {
            System.out.println(" " + addons.get(i));
        }
    }

    // prints out cost of service
    void calculating() {
        System.out.println("Calculating your order");
        System.out.println("Price: $" + price);
    }

    void submitting() {
        System.out.println("Submitting your order");
    }

    void emailing() {
        System.out.println("Check your email for order details.");
    }

    public String getName() {
        return name;
    }
}
