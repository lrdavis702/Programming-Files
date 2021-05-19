// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa7.java
// @version The date as 2021-03-14
// @brief This program uses arrays and methods to process voting data
// @note 3 hour 34 minutes taken to develop, write, test and debug
// solution.

/* pseudocode

INVOKE dealer Method
For each dealer (dealer count)
    INVOKE inputData Method
    INVOKE calculateCommission Method (sales)
INVOKE calculateTotalSales Method (sales, dealer count)
INVOKE calculateAverageSales Method (total sales, dealer count)
INVOKE totalCommision Method (commission, dealer count)
INVOKE displayResults Method

dealerCount Method
    DOWHILE Dealer Count != 1-20
        GET Dealer Count
        IF Dealer Count != 1-20
            PRINT Error Message
        ENDIF
    ENDDOWHILE

inputData Method
    GET name
    DOWHILE sales amount !numeric OR < 0
        GET sales amount
        IF sales amount !numeric || < 0
            PRINT Error Message
        ELSE RETURN dealer data
        ENDIF
    ENDDOWHILE

calculateCommission Method (sales)
    IF sales > 1 && < 5000
        commission = .1
    ELSEIF sales > 5000 && < 15000
        commission = .15
    ELSE commission = .2
    ENDIF
RETURN commission

calculateTotalSales Method (sales, dealer count)
    FOR each dealer
        Total Sales += sales
    ENDFOR

    RETURN Total Sales

calculateAverageSales Method (total sales, dealer count)
    return total sales / dealer count

total Commission Method (commission, dealer count)
    FOR each dealer
        total commission += sales * commission
    ENDFOR

    RETURN total commission
*/

import java.util.Scanner;

public class LatashaDavisTownsendcit130_pa7 {

   public static Scanner input = new Scanner(System.in);// create global scanner

   public static void main(String[] args) {
      // declare variables
      double[] sales;
      double[] commission;
      double totalSales;
      double totalAverageSales;
      double totalCommission;
      String[] dealerName;
      int dealerCount;
   
      // initialize variables
      dealerCount = getNumberOfDealers(); // invokes method to initialize dealer count
      sales = new double [dealerCount];
      dealerName = new String [dealerCount];
      totalSales = 0;
   
      // invokes method to populate sales and dealerName array
      getData(sales, dealerName);
   
      // invokes method to calculate the total sales
      totalSales = calculateTotalSales(sales, totalSales, dealerCount);
   
      // invokes method that returns an array with the calculated commission
      commission = calculateCommission(sales);
   
      // invokes method that returns the average sales for the dealership
      totalAverageSales = calculateAverageSales(totalSales, dealerCount);
   
      // invokes method that adds the total commission based on sales
      totalCommission = calculateTotalCommission(sales, commission);
   
      // invokes method that displays results
      displayData(dealerName, sales, commission, totalSales, totalAverageSales, totalCommission);
   }

   // method to calculate and return total sales for the dealership
   private static double calculateTotalSales(double[] sales, double totalSales, int dealerCount) {
      for (int counter = 0; counter < dealerCount; counter++) {
         totalSales += sales[counter];
      }
      return totalSales;
   } // end calulateTotalSales

   // method to calculate and return the total commission
   private static double calculateTotalCommission(double[] sales, double[] commission) {
      // declare variables
      double totalCommission;
   
      // initalize variable;
      totalCommission = 0;
   
      for (int counter = 0; counter < sales.length; counter++){
         totalCommission += commission[counter];
      }
      return totalCommission;
   } // end calculateTotalCommission

   // method to input and return the number of dealers
   public static int getNumberOfDealers(){
          // declare variables
      int dealerCount;
   
      do {
             // error checks and gets number of dealers from users
         System.out.print("How many dealers use you like to enter (1-20): ");
         dealerCount = input.nextInt();
         if(dealerCount > 21 || dealerCount < 1)
         {
            System.out.println("Invalid input");
         }
      } while (dealerCount < 0 || dealerCount > 20);
   
      return dealerCount;
   } // end getNumberOfDealers

   // method to gather the required input data (name and amount of sales)
   public static void getData(double []sales, String[] dealerName){
      for(int counter = 0; counter < sales.length; counter++){
         System.out.print("Please the name of dealer " + (counter + 1) + ": ");
         dealerName[counter] = input.next();
         do {
            System.out.print("Please the sales of dealer " + (counter + 1) + ": ");
            sales[counter] = input.nextDouble();
         
            // checks for negative values
            if (sales[counter] < 0) {
               System.out.println("Error: number cannot be negative.");
            }
         } while (sales [counter] < 0);
      } // end for loop
   } // end getData

   // method to calculate the commission array
   public static double [] calculateCommission(double[] sales){
      //declare variables
      double[] commission;
   
      //initialize variable
      commission = new double [sales.length];
   
      for(int counter = 0; counter < sales.length; counter++) {
      
         if (sales[counter] >= 1 && sales[counter] <= 5000) {
            commission[counter] = .1 * sales[counter];
         }
         else if (sales[counter] > 5000 && sales[counter] < 15000) {
            commission[counter] = .15 * sales[counter];
         }
         else commission[counter] = .2 * sales[counter];
      } // end for loop
      return commission;
   } // end calculateCommission

   // method to calculate and return average sales for the dealership
   public static double calculateAverageSales(double totalSales, int dealerCount){
      return totalSales/dealerCount;
   } // end calculateAverageSales

   /*method to display the dealer name and amount of sales and the amount of commission
   for all dealers in a tabular format. In addition, the method will display the total
   sales, average sales, and total commission.
    */
   public static void displayData(String[] dealerName, double[] sales, double[] commission, double totalSales,
                                  double totalAverageSales, double totalCommission){
      System.out.printf("\n%-10s%-10s      %-10s\n", "Dealers", "Sales", "Commission");
   
      for(int counter = 0; counter < sales.length; counter++) {
         System.out.printf("%-10s$%10.2f     $%10.2f\n", dealerName[counter], sales[counter], commission[counter]);
      }
   
      System.out.printf("\nTotal sales: $%.2f\n", totalSales);
      System.out.printf("Total average sales: $%.2f\n", totalAverageSales);
      System.out.printf("Total in commissions: $%.2f\n", totalCommission);
   } // end displayData
} //end LatashaDavisTownsendcit130_pa7.java