// Concrete subclass for BBAServices

package DesignPatterns.Services.Coaching;

import DesignPatterns.Services.BBAService;

public class Smart extends BBAService {
    public Smart(){
        name = "Run a S.M.A.R.T. Business";
        description = "4-Week Goal-Setting Program";
        sessions = 4;
        price = 399;

        addons.add("eBook: Your Roadmap to Success");
        addons.add("30-day Follow-up Session");    }
}