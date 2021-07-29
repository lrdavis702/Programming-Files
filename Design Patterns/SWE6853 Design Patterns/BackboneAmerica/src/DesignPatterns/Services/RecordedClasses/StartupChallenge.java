// Concrete subclass for BBAServices

package DesignPatterns.Services.RecordedClasses;

import DesignPatterns.Services.BBAService;

public class StartupChallenge extends BBAService {
    public StartupChallenge(){
        name = "31-Day Business Startup Challenge";
        description = "Challenge yourself to lay the ground work and start your business in a month";
        sessions = 1;
        price = 39;
    }
}