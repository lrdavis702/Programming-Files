package DesignPatterns.Services.EmployeeTraining;

import DesignPatterns.Services.BBAService;

public class MicrosoftWord extends BBAService {
    public MicrosoftWord() {
        name = "Microsoft Word";
        description = "Microsoft Word is a word processor included in Microsoft Office.";
        sessions = 8;
        price = 399;

        addons.add("Also available in two 4-hour sessions or one-day 8-hour session.");

    }
}