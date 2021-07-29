// Concrete subclass for BBAServices

package DesignPatterns.Services.BusinessPlanning;

import DesignPatterns.Services.BBAService;

public class BusinessPlanReview extends BBAService {
    public BusinessPlanReview(){
        name = "Business Plan Review";
        description =
                "|If you already have your business plan written,         |\n"+
                "|allow us to save you some money. We’ll thoroughly review|\n"+
                "|your business plan. Our reviews include a markup of your|\n"+
                "|document and recommendations to increase your chances of|\n"+
                "|obtaining funding.                                      |\n";
        sessions = 4;
        price = 599;

        addons.add("Investor-Ready Audit");
        addons.add("Money Back Guarantee");
    }
}