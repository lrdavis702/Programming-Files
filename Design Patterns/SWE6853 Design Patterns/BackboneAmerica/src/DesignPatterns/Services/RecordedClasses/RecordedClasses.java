// class instantiates RecordedClasses service
package DesignPatterns.Services.RecordedClasses;

import DesignPatterns.Services.BBAService;
import DesignPatterns.Services.ServiceFactory;

public class RecordedClasses extends ServiceFactory {
    public BBAService createService(String item) {

        // user selects from menu of choices... returns service
        if(item.charAt(0) == '1') return new StartupChallenge();
        else if(item.charAt(0) == '2') return new BusinessSuccess();
        else if(item.charAt(0) == '3') return new MiniMarketing();
        else if(item.charAt(0) == '4') return new MarketingStrategy();
        else return null;
    }
}