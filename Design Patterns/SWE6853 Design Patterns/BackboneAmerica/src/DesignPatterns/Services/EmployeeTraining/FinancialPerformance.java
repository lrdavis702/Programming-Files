// Concrete subclass for BBAServices

package DesignPatterns.Services.EmployeeTraining;

import DesignPatterns.Services.BBAService;

public class FinancialPerformance extends BBAService {
    public FinancialPerformance() {
        name = "Business Financial Performance";
        description =
                "|A financial performance system that will provide the             |\n"+
                "|differentiating point in the market that can catalyze your       |\n"+
                "|company’s success. Although originally perceived to be a         |\n"+
                "|training program, the real outcomes are actually centered around |\n"+
                "|business performance, business development, and retention.       |\n"+
                "|***16 hours worth of group training.                             |\n";
        sessions = 16;
        price = 599;

        addons.add("Financial Performance Training Binder");

    }
}