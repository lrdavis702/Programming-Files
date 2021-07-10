package udemy;

public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // initialize constructors
    public BankAccount() {
        System.out.println("Empty constructor");
    }

    public BankAccount (int number, double balance, String customerName, String email,
                        String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getters

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "BankAccount" +
                "accountNumber = " + number +
                "\ncustomerName = '" + customerName + '\'' +
                "\nemail = '" + email + '\'' +
                "\nphoneNumber = '" + phoneNumber + '\'' +
                "\nbalance = " + balance;
    }
}