// Abstract UserPrototype class implements Cloneable Interface
package DesignPatterns.UserRecord;

public abstract class UserPrototype implements Cloneable {
    private String type; // type of user (client/guest)
    private String fName; // first name
    private String lName; // last name
    private String userName; // unique user name
    private String email; // user email
    private String password; // user passsword

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}