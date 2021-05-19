// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa3java
// @version The date as 2021-02-10
// @brief This program displays a business card.
// Checks for correct password; accepts business contact
// information from the user. Makes calculations on a random
// number and prints the business card.
// @note 1 hour 57 minutes taken to develop, write, test and debug
// solution.

/* pseudocode
   creates random number
   calulates Log 10 on random number
   calculates random number ^3

   get password
   if password != stored password; print error message and end program
   else get user name, department, title, phone numbers, email
        if email missing @ symbol, print error message and end program
        else print business card with random number, Log 10 and ^3
 */

import java.util.Scanner;

public class LatashaDavisTownsendcit130_pa4 {
   public static void main(String[] args) {
   
      //declare and initialize variables
      String globalPassword; // correct password
      String userPassword; // password inputted from user
      String firstName; // user's first name
      String lastName; // user's last name
      String title; // user's title
      String department; // user's department
      String officeNumber; // user's office phonenumber
      String mobileNumber; // user's mobile phone number
      String email; // user's email
      char mailCode; // user's mail code
      double randomNum; // random number between 10.1 - 1000.1 used in calculations
      double logNum; // LOG base of the random number
      double powerNumber; // longNum raised to the power of 3
   
      Scanner input = new Scanner(System.in); // creates new scanner object
   
      // initalizing variables
      globalPassword = "java";
      randomNum = 10.1 + (Math.random() * (1000.1 - 10.1 + 1));
      logNum = Math.log10(randomNum);
      powerNumber = Math.pow(randomNum, 3);
   
      // get business contact info from user
      System.out.print("Enter your password: ");
      userPassword = input.nextLine();
   
      //checks for correct password in order to continue program
      if(!userPassword.equals(globalPassword)) //returns error message if password incorrect
         System.out.println("\nERROR – Invalid password – the program will terminate");
      else {
         System.out.print("Enter your first name: ");
         firstName = input.nextLine();
         System.out.print("Enter your last name: ");
         lastName = input.nextLine();
         System.out.print("Enter your title: ");
         title = input.nextLine();
         System.out.print("Enter your department: ");
         department = input.nextLine();
         System.out.print("Enter your office phone number: ");
         officeNumber = input.nextLine();
         System.out.print("Enter your mobile phone number: ");
         mobileNumber = input.nextLine();
         System.out.print("Enter your email: ");
         email = input.nextLine();
      
         //checks for @ in email address in order to continue program
         if(email.indexOf("@") == -1) // gives error message if no @
            System.out.println("ERROR: Incorrect email address instead of the given email address.");
         else {
            System.out.print("Enter your office mail code (one-character code): ");
            mailCode = input.next().charAt(0);
         
            //prints business card
            System.out.println("\nHere is your official business card:");
            System.out.println("*------------------------------------------*\n|");
            System.out.println("| " + firstName + " " + lastName);
            System.out.println("| " + title);
            System.out.println("| " + department);
            System.out.println("| Office Phone " + officeNumber);
            System.out.println("| Mobile Phone " + mobileNumber);
            System.out.println("| " + email);
            System.out.println("| Mail code: " + mailCode);
            System.out.print("| Your assigned random number: " );
            System.out.printf("%5.2f\n", randomNum);
            System.out.print("| The log base 10 of your random number is: ");
            System.out.printf("%6.4f\n", logNum);
            System.out.print("| The random number raised to the power of 3 is: ");
            System.out.printf("%9.4f\n", powerNumber);
            System.out.println("*------------------------------------------*");
         
         }
      }
   } // end main
} // end class
