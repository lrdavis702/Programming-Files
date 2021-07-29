// Concrete subclass for BBAServices

package DesignPatterns.Services.EmployeeTraining;

import DesignPatterns.Services.BBAService;

public class MicrosoftExcel extends BBAService {
    public MicrosoftExcel() {
        name = "Microsoft Excel";
        description = "Microsoft Excel is a spreadsheet editor.";
        sessions = 8;
        price = 399;

        addons.add("Also available in two 4-hour sessions or one-day 8-hour session.");

    }
}