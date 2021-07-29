// Concrete class for Clients, extends UserPrototype
package DesignPatterns.UserRecord;

public class Client extends UserPrototype {
    private int revenue;

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Client Record{" +
                "First Name='" + getfName() + '\'' +
                ", Last Name='" + getlName() + '\'' +
                ", UserName='" + getUserName() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Purchase='" + getRevenue() + '\'' +
                '}';
    }
}