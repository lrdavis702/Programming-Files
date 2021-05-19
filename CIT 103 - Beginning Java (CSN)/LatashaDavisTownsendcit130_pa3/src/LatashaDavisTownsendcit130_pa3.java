// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa3java
// @version The date as 2021-02-04
// @brief Calculate the cost of renting rooms at a hotel.
// Calculates a discount, determined by the number of rental
// days and rooms. Calculates the taxes based upon the pre-discount
// rate.
// @note 70 minutes taken to develop, write, test and debug
// solution.

/* pseudocode
   get room rate
   get number of rooms
   get number of rental days
   get tax rate

   -calculate discounts
   if rooms > 0 && < 10, room discount = 10%
   else if rooms >= 10 && <= 20, room discount = 20%
   else if rooms > 20, room discount = 30%

   if rental days >= 3, day rental = 5%

   -calculate room charges
   pre-discount/tax rent = rent * rooms * days
   taxes = pre-discount/tax rent * tax rate percentage
   post-discount rent = pre-discount rent - total rent * total discount
   final bill = post-discount rent + taxes

   -output
   if room is < 1 || days is <1, print error message
   else print room charges
 */

import java.util.Scanner;
public class LatashaDavisTownsendcit130_pa3 {
   public static void main (String[] args) {
   
      //declare and initialize variables
      double rent = 0; // cost of renting a room
      double taxRate = 0; // sales tax rate
      double taxes = 0; // sales tax
      double roomDiscount = 0; // discount for number of rooms
      double dayDiscount = 0; // discount for number of days
      double totalRent = 0; // total room rental (pre-tax)
      double totalBill = 0; // final room rental bill (post-tax)
      int rooms = 0; // number of rooms rented
      int days = 0; // number of days room is rented
      Scanner input = new Scanner(System.in); //create new object scanner
   
      // Prompts the user for room rental information
      System.out.print("What is the cost for renting one room for one night? ");
      rent = input.nextDouble();
      System.out.print("How many rooms are booked? ");
      rooms = input.nextInt();
      System.out.print("How many days are the rooms booked for? ");
      days = input.nextInt();
      System.out.print("What is the sales tax? (For example, if tax is 15.5%, enter 15.5.) ");
      taxRate = input.nextDouble();
   
      // process to determine discount
      // brief did not specify what happens if room is = 10 || 1. Made check within code.
      if (rooms > 0 && rooms < 10) roomDiscount = 10;
      else if (rooms >= 10 && rooms <= 20) roomDiscount = 20;
      else if (rooms > 20) roomDiscount = 30;
   
      if (days >= 3) dayDiscount = 5;
   
      // process room charges and taxes
      totalRent = rent * rooms * days;
      taxes = totalRent * taxRate/100;
      totalRent = totalRent - (totalRent * (roomDiscount + dayDiscount)/100);
      totalBill = totalRent + taxes;
   
      // output error messages and room rates
      if (rooms < 1) System.out.println ("\nERROR: At least one room must be booked for they stay.");
      else if (days < 1) System.out.println("\nERROR: Room must be booked for at least one day.");
      else {
         System.out.println("\nCost for one room: $" + rent);
         System.out.println("Discount on based on number of rooms: " + roomDiscount + "%");
         System.out.println("Discount based number of days: " + dayDiscount + "%");
         System.out.println("Number of rooms: " + rooms);
         System.out.println("Number of days: " + days);
         System.out.println("Total cost before Tax: $" + totalRent);
         System.out.println("Tax: $" + taxes);
         System.out.println("Total Bill: $" + totalBill);
      }// end output
   
   } // end main
} // end LatashaDavisTownsendcit130_pa3 class
