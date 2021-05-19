// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa2.java
// @version The date as 2021-02-02
// @brief calculates the future value of an investment using
// compound interest and estimate the value of π .
// @note 58 minutes taken to develop, write, test and debug
// solution.

// psuedocode
// *calculate compound interest
// get principal from keyboard
// get annual interest rate from keyboard
// calculate rate to percentage (rate = rate / 100)
// get number of times/year interest is compounded from keyboard
// get number interest-earning years from keyboard
// calculate new balance (balance = principal (1 + rate / times)^(times * years))
// output results

// *calculate pi
// set pi to formula (4 * (1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 + 1/13)
// output results

import java.util.Scanner;
public class LatashaDavisTownsendcit130_pa2 {
   public static void main (String[] args){
      Scanner input = new Scanner(System.in); //create new scanner object
   
      // prompt user to input balance
      System.out.print("Enter the original balance: ");
      double principal = input.nextDouble(); // the original amount of deposit
   
      // prompt user to input rate
      System.out.print("Enter the annual interest rate: ");
      double rate = input.nextDouble() / 100.0; // the annual interest rate as a whole value
   
      // prompt user to input times/year interest is compounded
      System.out.print("Enter the number of times per year that the interest is compounded: ");
      int times = input.nextInt(); // the number of times per year that the interest is compounded
   
      // prompt user to input interest-earning years
      System.out.print("Enter the number of years for the account to earn interest: ");
      int years = input.nextInt(); // the specified number of years
   
      double balance = principal * Math.pow(1 + rate / times, times * years); // the amount of money after a certain number of years
   
      // output results
      System.out.println();
      System.out.println("************ ACME BANK");
      System.out.println("Original Balance = $" + principal);
      System.out.println("Annual interest rate = " + rate * 100 + "%");
      System.out.println("Interested compounded " + times + " times per year");
      System.out.println("Number of years = " + years);
      System.out.println("Final balance after " + years +
             " years at an annual rate of " + rate * 100 +
             "% compounded " + times + " times per year is: $" + balance);
      System.out.println();
   
   
      // calculate and output pi
      double pi = 4.0 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0 + 1.0/13.0); // calculates the value of pi
      System.out.println("Estimated value of π = " + pi);
   } // end main
} // end class
