package DesignPatterns.UserRecord;

public class Prospect extends UserPrototype {

    @Override
    public String toString() {
        return "Store your login details for later.\n" +
                "User Record{" + getfName() + " " + getlName() + "}\n" +
                "UserName = " + getUserName() + "\n" +
                "Email = " + getEmail() + "\n";
    }
}
