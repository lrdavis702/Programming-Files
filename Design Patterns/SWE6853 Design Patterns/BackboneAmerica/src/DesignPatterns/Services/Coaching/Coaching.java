package DesignPatterns.Services.Coaching;

import DesignPatterns.Services.BBAService;
import DesignPatterns.Services.Coaching.Group.GroupRoadmap;
import DesignPatterns.Services.Coaching.Group.GroupSmart;
import DesignPatterns.Services.ServiceFactory;

public class Coaching extends ServiceFactory {
    public BBAService createService(String item){

        if(item.charAt(0) == '1') return new Breakthrough();
        else if(item.charAt(0) == '2') return new Smart();
        else if(item.charAt(0) == '3') return new Roadmap();
        else if(item.charAt(0) == '4') return new GroupRoadmap();
        else if(item.charAt(0) == '5') return new GroupSmart();
        else return null;
    }
}
