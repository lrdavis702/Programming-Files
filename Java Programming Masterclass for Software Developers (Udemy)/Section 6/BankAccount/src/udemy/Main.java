package udemy;

import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
// create customer account
        BankAccount custAccount = new BankAccount(12345, 500, "Renee", "renee@default.com",
                "(800) 555 - 5555");
        System.out.println(custAccount.toString());

        depositFunds(custAccount);
        withdrawFunds(custAccount);
    }

    public static void depositFunds(BankAccount custAccount){
        // get amount amount
        System.out.print("How much do you want to deposit? ");
        double amount = input.nextDouble();

        // add amount to balance and set new account balance
        custAccount.setBalance(custAccount.getBalance() + amount);
        display(custAccount);
    }

    public static void withdrawFunds(BankAccount custAccount){
        // get amount amount
        System.out.print("How much do you want to withdraw? ");
        double amount = input.nextDouble();

        if(custAccount.getBalance() >= amount) {
            // subtract amount to balance and set new account balance
            custAccount.setBalance(custAccount.getBalance() - amount);
        }
        else System.out.println("Insufficient funds");
        display(custAccount);
    }

    public static void display(BankAccount custAccount){
        System.out.println(custAccount.toString());
    }
}
