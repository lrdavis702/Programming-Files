// Concrete subclass for BBAServices

package DesignPatterns.Services.BusinessPlanning;

import DesignPatterns.Services.BBAService;

public class StandardFunding extends BBAService {
    public StandardFunding(){
        name = "Standard Business Funding Package";
        description =
                "|If you’re the Do-It-Yourself Entrepreneur,                 |\n"+
                "|this is the plan for you. Over the course of 8 sessions,   |\n"+
                "|we’ll take you through the process of getting your         |\n"+
                "|business funded. This program is great if you need to move |\n" +
                "|quickly, because sessions are scheduled at the pace you    |\n"+
                "|need to go. Best of all, this comes with a business plan   |\n"+
                "|review.                                                    |\n";
        sessions = 8;
        price = 999;

        addons.add("Business Plan Review");
        addons.add("Tools, Templates, & Resources");
        addons.add("Guidance with Financial Projections");
        addons.add("Funding Leads");
    }
}