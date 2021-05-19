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
// @note 3 hour 2 minutes taken to develop, write, test and debug
// solution.

/* pseudocode
   while menu selection not exit
        print menu
        get menu selection
        if selection not on menu
            print error message
        end if

        else
            case based on selection
                case student report
                    get number of assignments
                    while # of assignments < 1
                        print error message
                        get # of assignments
                    end while

                    set assignment counter to 1
                        while assignment counter <= # of assignments
                            get score for assignment
                            while score ! 0-100
                                print error message
                                get score
                            end while
                            add score to assignment total
                        end while

                     set exam counter to 1
                        while exam counter <= 2
                            get score for exam
                            while score ! 0-100
                                print error message
                                get score
                            end while
                            add (score * 0.1) to exam total
                        end while

                     get score for final exam
                        while score ! 0-100
                            print error message
                            get score
                        end while
                     add (score * 0.15) to exam total

                     final grade = assignment total * .65 + exam total

                     if final grade > 94, A
                     else if final grade 90-94, final grade = A-
                     else if final grade 87-90, final grade = B+
                     else if final grade 84-87, final grade = B
                     else if final grade 80-84, final grade = B-
                     else if final grade 77-80, final grade = C+
                     else if final grade 70-77, final grade = C
                     else if final grade 60-70, final grade = D
                     else final grade = F

                     print student report
                     end case student report

                 case purchases
                    set item counter to 0
                    do while price > 0
                        get price
                        if price > 0
                            item counter + 1
                            subtotal += price
                        end if
                    end do while

                    print receipt
                end case purchases

                case exit
                    print exit statement
                end case exit
 */

import java.util.Scanner;

public class LatashaDavisTownsendcit130_pa5 {
   public static void main(String[] args) {
   
      //declare variables
      int assignments; // number of assignments
      double assignScore; // score on assignments
      double assignPoints; // total points earned from assignments
      double assignAvg; //
      double examPoints; // total points earned from exams
      double finalGrade; // overall grade
      String letterGrade; // letter grade
   
      double price; // price of item
      int items; // number of items purchased
      double taxRate; // tax rate
      double subTotal; // subtotal of purchases (pretax
      double averagePrice; // average price of items
      double totalPrice; // total cost of purchases
   
      char menuItem; // menu option
   
      Scanner input = new Scanner (System.in); // create new scanner object
           
      // initialize menu item
      menuItem = 0;
           
      // display menu   
      while(menuItem != 51) {
         System.out.println("Enter 1 to calculate grade,");
         System.out.println("enter 2 to calculate purchases,");
         System.out.println("enter 3 to exit the program.");
         System.out.print("Enter an option: ");
      
         menuItem = input.next().charAt(0);
      
         // print error message if user input not a menu item
         if(menuItem < 49 || menuItem > 51) {
            System.out.println("The option you entered is incorrect.\n");
         }
         
         else {
         
            switch (menuItem) {                     
               // calculates grades
               case 49:
                  // initialize variables
                  assignments = 0;
                  assignPoints = 0;
                  examPoints = 0;
               
                  // gets number of assignments
                  System.out.print("\nEnter the number of assignments: ");
                  assignments = input.nextInt();
               
                  //checks for assignment validation
                  while (assignments < 1) {
                     System.out.println("The number you entered is incorrect.");
                     System.out.print("Enter the number of assignments (1 or more): ");
                     assignments = input.nextInt();
                  }
               
                  // gets score values for assignments
                  for (int i = 1; i <= assignments; i++) {
                     System.out.print("Enter the score for assignment " + i + ": ");
                     assignScore = input.nextDouble();
                  
                     // checks for valid score
                     while (assignScore < 0 || assignScore > 100) {
                        System.out.println("The score you entered is incorrect.");
                        System.out.print("Enter the score for assignment " + i + " (0 - 100): ");
                        assignScore = input.nextDouble();
                     }
                     assignPoints += assignScore; // adds score to total assignment points
                  }
                  
                  assignAvg = assignPoints / assignments; //calculates the assignment average
               
                  // gets values for exams
                  for (int i = 1; i <= 2; i++) {
                     System.out.print("Enter the score for exam " + i + ": ");
                     assignScore = input.nextDouble();
                  
                     // checks for valid score
                     while (assignScore < 0 || assignScore > 100) {
                        System.out.println("The score you entered is incorrect.");
                        System.out.print("Enter the score for exam " + i + " (0 - 100): ");
                        assignScore = input.nextDouble();
                     }
                     examPoints += assignScore * .1; // adds weighted score to total exam points
                  }
               
                  // gets value for final exam
                  System.out.print("Enter the score for final exam: ");
                  assignScore = input.nextDouble();
               
                  // checks for valid score
                  while (assignScore < 0 || assignScore > 100) {
                     System.out.println("The score you entered is incorrect.");
                     System.out.print("Enter the score for final exam (0 - 100): ");
                     assignScore = input.nextDouble();
                  }
                  examPoints += assignScore * .15; // adds weighted score to total exam points
               
                  // calculates assignment average and overall grade
                  finalGrade = assignAvg * .65 + examPoints;
               
                  // determines letter grade based on weighted final grade
                  if (finalGrade >= 94 ) {
                     letterGrade = "A";
                  }
                  else if (finalGrade >= 90 && finalGrade < 94) {
                     letterGrade = "-A";
                  }
                  else if (finalGrade >= 87 && finalGrade < 90) {
                     letterGrade = "B+";
                  }
                  else if (finalGrade >= 84 && finalGrade < 87) {
                     letterGrade = "B";
                  }
                  else if (finalGrade >=80 && finalGrade < 84) {
                     letterGrade = "B-";
                  }
                  else if (finalGrade >= 77 && finalGrade < 80) {
                     letterGrade = "C+";
                  }
                  else if (finalGrade >= 70 && finalGrade < 77) {
                     letterGrade = "C";
                  }
                  else if (finalGrade >= 60 && finalGrade < 70) {
                     letterGrade = "D";
                  }
                  else letterGrade = "F";
               
                  // print student grades
                  System.out.println("\n*** Student Report ***");
                  System.out.println("Number of assignments: " + assignments);
                  System.out.print("Assignment average: ");
                  System.out.printf("%.2f\n", assignAvg);
                  System.out.print("Overall Grade: ");
                  System.out.printf("%.2f\n", + finalGrade);
               
                  System.out.println("\nLetter Grade: " + letterGrade + "\n");
               
                  break; // end case 1
            
               case 50:
               
               //initialize variables
                  items = 0;
                  subTotal = 0;
                  taxRate = .08;
                  price = 1;
               
                  // gets price until price is 0 or less
                  do {
                     System.out.print("Enter the price of an item (or the number 0 or less to stop): ");
                     price = input.nextDouble();
                  
                     if(price > 0) {
                        items++;
                        subTotal += price;
                     }
                  } while (price > 0);
               
                  // calculates total price and average price
                  if (items == 0) {
                     totalPrice = 0;
                     averagePrice = 0;
                  }
                  
                  else {
                     totalPrice = subTotal + subTotal * taxRate;
                     averagePrice = totalPrice / items;
                  }
               
                  // print purchase
                  System.out.println("\n*** Report ***");
                  System.out.print("Total price of purchases: $");
                  System.out.printf("%.2f", subTotal);
                  System.out.println("\nNumber of items purchased: " + items);
                  System.out.print("Total price plus tax (8%): $");
                  System.out.printf("%.2f", totalPrice);
                  System.out.print("\nAverage Price: $");
                  System.out.printf("%.2f", averagePrice);
                  System.out.println("\n");
               
                  break; // end case 2
            
               case 51:
                  System.out.println("Thanks for using my program.");
                  break;
            } // end switch case
         } // end else starting switch case
      } //end while for display menu
   } // end main
} // end class
