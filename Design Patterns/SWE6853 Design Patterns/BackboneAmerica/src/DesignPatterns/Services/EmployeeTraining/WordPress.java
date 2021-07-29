// Concrete subclass for BBAServices

package DesignPatterns.Services.EmployeeTraining;

import DesignPatterns.Services.BBAService;

public class WordPress extends BBAService {
    public WordPress() {
        name = "WordPress Management";
        description =
                "|WordPress is the most popular content management system  |\n"+
                "|(CMS) on the web. On top of that, it’s free to download, |\n"+
                "|install, and use. Our workshop takes you through:        |\n";
        sessions = 4;
        price = 299;

        addons.add("Registering a Domain");
        addons.add("Purchasing a Hosting Package");
        addons.add("Installing WordPress");
        addons.add("Understanding and Managing WordPress");
    }
}