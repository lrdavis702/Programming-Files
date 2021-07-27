package DesignPatterns.Services.RecordedClasses;

import DesignPatterns.Services.BBAService;

public class MarketingStrategy extends BBAService {
    public MarketingStrategy() {
        name = "REVEAL Your Marketing Strategy";
        description = "Step off the hamster wheel and develop an action plan that delivers results.\n";
        sessions = 1;
        price = 299;
    }
}