// Concrete subclass for BBAServices
package DesignPatterns.Services.Coaching;

import DesignPatterns.Services.BBAService;

public class Roadmap extends BBAService {
    public Roadmap(){
        name = "Your Roadmap to Success";
        description = "3-Month Business Coaching Program";
        sessions = 12;
        price = 999;

        addons.add("Paperback: Your Roadmap to Success");
        addons.add("30-day Follow-up Session");

    }
}