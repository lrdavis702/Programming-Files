package DesignPatterns.Services.Coaching;

import DesignPatterns.Services.BBAService;

public class Breakthrough extends BBAService {
    public Breakthrough(){
        name = "Breakthrough Laser Session";
        description = "90-Minute Laser Coaching";
        sessions = 1;
        price = 149;

        addons.add("eBook: Your Roadmap to Success");
    }
}
