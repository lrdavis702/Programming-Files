package DesignPatterns.Services.BusinessPlanning;

import DesignPatterns.Services.BBAService;

public class AcceleratedFunding extends BBAService {
    public AcceleratedFunding(){
        name = "Accelerated Business Funding Package";
        description =
                "|If you’ve never run a business or don’t know where       |\n"+
                "|to go for funding, we highly recommend our Start Your    |\n"+
                "|Business Right Program. We walk you through the steps of |\n"+
                "|creating a business plan and getting your business setup |\n"+
                "|legal. Plus, we do a business plan review, develop your  |\n"+
                "|financial projections, and research extensively for      |\n"+
                "|funding opportunities for you.                           |\n";
        sessions = 8;
        price = 999;

        addons.add("Standard Business Funding Package");
        addons.add("Business Setup Assistance");
        addons.add("5-Year Financial Pro Forma");
        addons.add("Funding Research");
        addons.add("Growth Potential Package");
    }
}