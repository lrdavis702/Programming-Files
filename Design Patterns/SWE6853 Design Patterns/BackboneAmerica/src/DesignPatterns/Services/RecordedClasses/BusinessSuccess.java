// Concrete subclass for BBAServices

package DesignPatterns.Services.RecordedClasses;

import DesignPatterns.Services.BBAService;

public class BusinessSuccess extends BBAService {
    public BusinessSuccess(){
        name = "Map Your Business Success";
        description = "A Step-by-Step, Quarterly Plan for Putting Your Business into Action\n";
        sessions = 1;
        price = 29;

        addons.add("eBook: Your Roadmap to Success");
    }
}