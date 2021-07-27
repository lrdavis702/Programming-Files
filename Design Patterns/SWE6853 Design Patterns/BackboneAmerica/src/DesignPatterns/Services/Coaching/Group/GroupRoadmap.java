package DesignPatterns.Services.Coaching.Group;

import DesignPatterns.Services.BBAService;

public class GroupRoadmap extends BBAService {
    public GroupRoadmap(){
        name = "Your Roadmap to Success";
        description = "3-Month Business Coaching Program";
        sessions = 12;
        price = 499;

        addons.add("Paperback: Your Roadmap to Success");
        addons.add("30-day Follow-up Session");
    }
}