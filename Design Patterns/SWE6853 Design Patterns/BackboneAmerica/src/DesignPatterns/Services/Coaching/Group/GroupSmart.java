// Concrete subclass for BBAServices
package DesignPatterns.Services.Coaching.Group;

import DesignPatterns.Services.BBAService;

public class GroupSmart extends BBAService {
    public GroupSmart(){
        name = "Run a S.M.A.R.T. Business";
        description = "4-Week Goal-Setting Program";
        sessions = 4;
        price = 199;

        addons.add("eBook: Your Roadmap to Success");
        addons.add("30-day Follow-up Session");
    }
}