// class instantiates BusinessPlanning service
package DesignPatterns.Services.BusinessPlanning;

import DesignPatterns.Services.BBAService;
import DesignPatterns.Services.ServiceFactory;

public class BusinessPlanning extends ServiceFactory {
    public BBAService createService(String item){

        // user selects from menu of choices... returns service
        if(item.charAt(0) == '1') return new BusinessPlanReview();
        else if(item.charAt(0) == '2') return new FinancialProjections();
        else if(item.charAt(0) == '3') return new StandardFunding();
        else if(item.charAt(0) == '4') return new AcceleratedFunding();
        else return null;
    }
}