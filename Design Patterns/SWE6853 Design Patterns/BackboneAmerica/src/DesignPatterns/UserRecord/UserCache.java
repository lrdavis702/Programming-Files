package DesignPatterns.UserRecord;

import java.util.HashMap;
import java.util.Map;

public class UserCache {
    private Map<UserType, UserPrototype> users = new HashMap();

    public UserCache() {
        this.initialize();
    }

    public UserPrototype getUserPrototype(UserType customerType) {
        UserPrototype customer = null;
        try {
            customer = (UserPrototype) users.get(customerType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return customer;
    }

    private void initialize() {
        Client client = new Client();

        client.setType("client");
        client.setfName("First Name");
        client.setlName("Last Name");
        client.setUserName("UserName");
        client.setEmail("email@email.com");
        client.setPassword("password");
        client.setRevenue(0);

        Prospect prospect = new Prospect();
        prospect.setType("Prospect");
        prospect.setfName("First Name");
        prospect.setlName("Last Name");
        prospect.setUserName("UserName");
        prospect.setEmail("email@email.com");
        prospect.setPassword("Password");

        users.put(UserType.CLIENT, client);
        users.put(UserType.PROSPECT, prospect);
    }
}