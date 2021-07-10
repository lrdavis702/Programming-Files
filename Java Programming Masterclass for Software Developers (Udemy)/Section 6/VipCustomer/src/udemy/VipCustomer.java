package udemy;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // initialize custructors

    public VipCustomer () {
        this("default name" , 10000 , "default@email.com");
    }

    public VipCustomer (String name, double creditLimit) {
        this(name, creditLimit, "unknown@default.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
