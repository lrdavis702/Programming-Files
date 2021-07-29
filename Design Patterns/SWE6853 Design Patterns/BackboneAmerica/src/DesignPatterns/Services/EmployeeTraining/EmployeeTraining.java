// class instantiates EmployeeTraining service
package DesignPatterns.Services.EmployeeTraining;

import DesignPatterns.Services.BBAService;
import DesignPatterns.Services.ServiceFactory;

public class EmployeeTraining extends ServiceFactory {
    public BBAService createService(String item){

        // user selects from menu of choices... returns service
        if(item.charAt(0) == '1') return new MicrosoftWord();
        else if(item.charAt(0) == '2') return new MicrosoftExcel();
        else if(item.charAt(0) == '3') return new MicrosoftPowerPoint();
        else if(item.charAt(0) == '4') return new WordPress();
        else if(item.charAt(0) == '5') return new FinancialPerformance();
        else return null;
    }
}