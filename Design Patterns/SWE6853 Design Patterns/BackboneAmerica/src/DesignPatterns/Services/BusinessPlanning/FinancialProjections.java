// Concrete subclass for BBAServices

package DesignPatterns.Services.BusinessPlanning;

import DesignPatterns.Services.BBAService;

public class FinancialProjections extends BBAService {
    public FinancialProjections(){
        name = "Financial Projections";
        description =
                "|Are you great at words but rather not deal with the        |\n"+
                "|numbers? Financial projections are our speciality. We'll   |\n"+
                "|interview you to identify the numbers we need. Then, we    |\n"+
                "|put together financial projections that meet bank and      |\n"+
                "|investor standards.                                        |\n";
        sessions = 4;
        price = 699;

        addons.add("Investor-Ready Audit");
        addons.add("Money Back Guarantee");
    }
}