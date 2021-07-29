// Concrete subclass for BBAServices

package DesignPatterns.Services.EmployeeTraining;

import DesignPatterns.Services.BBAService;

public class MicrosoftPowerPoint extends BBAService {
    public MicrosoftPowerPoint() {
        name = "Microsoft Powerpoint";
        description =
                "|Microsoft PowerPoint is a presentation program used to       |\n"+
                "|create slideshows composed of text, graphics, and other      |\n"+
                "|objects, which can be displayed on-screen and shown by the   |\n"+
                "|presenter or printed out on transparencies or slides.        |\n";
        sessions = 8;
        price = 399;

        addons.add("Also available in two 4-hour sessions or one-day 8-hour session.");
    }
}