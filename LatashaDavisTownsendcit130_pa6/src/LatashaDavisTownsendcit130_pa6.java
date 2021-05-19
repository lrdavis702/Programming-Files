// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa6.java
// @version The date as 2021-03-01
// @brief This program includes 3 menu items.
// 1) calculates the body fat percentage
// 2) the future value of an investment.
// 3) Ends the program.
// @note 4 hour 40 minutes taken to develop, write, test and debug
// solution.

/* pseudocode
Main Method
   Do While menu option != 3
      Invoke printMenu Method
      Get menu option
      If menu option = 1
         Get gender
         Invoke getBFT
      Else If menu option = 2
         Invoke getFV
      Else if menu option = 3
         Print end program line
      Else
         Invoke Invalid method
      EndIf
   EndDoWhile   
End Main Method

getBFT Method      
   Get weight
   Get waist
   If female
      Get hip
      Get forearm
      Calculate BFT
   EndIf
   If male
      Calulate BFT
   EndIf
   Else BFT = -111
   Return BFT   
End getBFT Method

getFV Method
   Calculate Future Value
   Return Future Value
End getFV Method
 */

import java.util.Scanner;

public class LatashaDavisTownsendcit130_pa6 {

   static Scanner input = new Scanner (System.in); // create new scanner object

   public static void main(String[] args) {
   
      //declare variables
      String gender; // stores male or female
      String entry; // dummy input field
      double investedAmount; // present value of investment
      double yearlyInterestRate; // yearly interest rate
      int numberOfYears; // number of years amount invested
      char menuOption; // field to store menu selections
   
      // loops menu until user quits
      do {
         printMenu();
         menuOption = input.next().charAt(0);
         
         // process to calculate Body Fat Percentage
         if(menuOption == '1'){
            System.out.print("Please enter the gender (male or female): ");
            entry = input.next();
            gender = entry.toLowerCase();
            System.out.printf("Body Fat Percentage = %.2f\n\n" , getBFT(gender)); // invokes method and prints BFT
         }
         
         // process to calculate Future Value
         else if(menuOption == '2'){
            System.out.print("Enter investment amount: ");
            investedAmount = convertDouble();
            System.out.print("Enter yearly rate: ");
            yearlyInterestRate = convertDouble();
            System.out.print("Enter number of years to calculate the future value: ");
            numberOfYears = convertInt();
         
            //invokes method and prints future value
            System.out.printf("Future Value = $%.2f\n\n", getFV(investedAmount, yearlyInterestRate, numberOfYears));
         }
         
         // ends program
         else if(menuOption == '3'){
            System.out.println("Thank you. Goodbye!");
         }   
         
         // prints error message if other than 1-3 entered into menu
         else
            invalidOption();
      } while (menuOption != '3'); // end do while
   
   } // end main

// method to print menu
   public static void printMenu(){
      System.out.println("1. Calculate Body Fat Percentage");
      System.out.println("2. Calculate Future Value of an Investment");
      System.out.println("3. End the Program");
   }

   // prints error message
   public static void invalidOption(){
      System.out.println("Invalid Input\n");
   }

// method to calculate body fat percentage
   public static double getBFT(String gender){
   
   // declare variables
      String entry;
      boolean validEntry;
      double weight; // weight of user
      double waist; // waist measurement of user
      double hip; // hip measurement of user
      double wrist; // wrist measurement of user
      double forearm; // forearm of user
   
      // get weight and waist measurements for both genders
      if(gender.equals("female") || gender.equals("male")) {
         System.out.print("Enter Weight: ");
         weight = convertDouble();
         System.out.print("Enter your waist measurement: ");
         waist = convertDouble();
      }
      else // error if not male or female
         return -111;
   
   // bfp input and calculation for female
      if(gender.equals("female")){
         System.out.print("Enter your wrist measurement: ");
         wrist = convertDouble();
         System.out.print("Enter your hip measurement: ");
         hip = convertDouble();
         System.out.print("Enter your forearm measurement: ");
         forearm = convertDouble();
         return (weight - (((weight * .732) + 8.987) + //A1
            (wrist / 3.14) -//A2
            (waist * .157) -//A3
            (hip * .249) +//A4
            (forearm * .434))) * 100 / weight; //A5
      }
      
      // bfp calculation for male   
      else {
         return (weight - (((weight * 1.082) + 94.42) - //A1
            (waist * 4.15))) * 100 / weight; //A2
      }
   }

   // method to calculate future value
   public static double getFV(double investedAmount, double yearlyInterestRate, int numberOfYears){
      yearlyInterestRate /= 100; // turns yearly interest rate into percentage
   
      return investedAmount * Math.pow((1 + (yearlyInterestRate / 12)) , (numberOfYears * 12));
   }
   
   // check to see if string is a double
   // modified code from here: https://www.techiedelight.com/determine-string-valid-number-java/
   public static boolean isDouble(String s) {
      //declare & initialize variable
      int count; // count '.'
      count = 0;
      if (s == null || s.equals("")) {
         return false;
      }
      
      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         if (c == '.') {
            count++;
         }
         if (count > 1) {
            return false;
         }
         if (c < '0' || c > '9') {
            if (c != '.')
               return false;
         }
      }
      return true;
   } // end isDouble

   // used code from here: https://www.techiedelight.com/determine-string-valid-number-java/
   public static boolean isNumeric(String s) {
      if (s == null || s.equals("")) {
         return false;
      }
   
      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         if (c < '0' || c > '9') {
            return false;
         }
      }
      return true;
   } // end isNumeric

 // converts string to double
   public static double convertDouble(){
   // declare variable
      String entry;
   
      do {
         entry = input.next();
         if (!isDouble(entry)){
            invalidOption();
            System.out.print("Enter a positive number: ");
         }
      } while (!isDouble(entry));
      return Double.parseDouble(entry); // converts string to double pp.384-385
   } // end convertDouble       
   
// converts string to int
   public static int convertInt(){
   // declare variable
      String entry;
   
      do {
         entry = input.next();
         if (!isNumeric(entry)){
            invalidOption();
            System.out.print("Enter a positive integer: ");
         }
      } while (!isNumeric(entry)); 
      return Integer.parseInt(entry); // converts string to int pp.384-385
   } // end convertInt 

} // end class
