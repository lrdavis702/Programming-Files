// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa8.java
// @version The date as 2021-03-22
// @brief This is a program to practice with the basic concepts
// of OOP by testing various operations on the objects of a class
// called Month
// @note 3 hour 34 minutes taken to develop, write, test and debug
// solution.

/* pseudocode
* Main Class
*   DOWHILE monthNumber != -99
*       SET monthNumber constructor
*       INVOKE getMonthNumber method() monthNumber: int
*       DISPLAY Output
*   END DOWHILE
*
*   DOWHILE monthNAME != "done"
*       SET monthName constructor
*       getMonthName method() monthName: String
*       DISPLAY Output
*   END DOWHILE
*
* Month Class
* monthNumber: int
*
* INVOKE
*
* Constructor setMonthNumber ()
*   SET monthNumber = 1
* END setMonthNumber
*
* Constructor setMonthNumber(newInt: int)
*   IF newInt > 12 || newInt < 1
*       monthNumber =  1
*   ELSE monthNumber = newInt
*   ENDIF
* END setMonthNumber
*
* Constructor setMonthNumber(newMonthName: string)
*   newMonthName = INVOKE stringToCapital
*   SWITCH CASE (newMonth)
*       CASE January
*           monthNumber = 1
*       CASE February
*           monthNumber = 2
*       CASE March
*           monthNumber = 3
*       CASE April
*           monthNumber = 4
*       CASE May
*           monthNumber = 5
*       CASE June
*           monthNumber = 6
*       CASE July
*           monthNumber = 7
*       CASE August
*           monthNumber = 8
*       CASE September
*           monthNumber = 9
*       CASE October
*           monthNumber = 10
*       CASE November
*           monthNumber = 11
*       CASE December
*           monthNumber = 12
*       DEFAULT
*           monthNumber = 1
*   ENDSWITCH CASE
*   RETURN newMonthName
*
* Constructor setMonthName (newMonthName: string)
*   monthName = INVOKE setMonthNumber(newMonthName)
* END setMonthName
*
* Constructor getMonthNumber: int
*   return monthNumber
* END getMonthNumber
*
* Constructor getMonthName: String
*   return monthName
* END getMonthName
*
*
*
* stringToCapital Class (newString) capitalizes first letter, converts all other letters to lower case
*   CONVERT newString to lower case (see page 130 toLowerCase())
*   CONVERT newString first character upper case (see page 130 toUpperCase/charAt(index))
*   RETURN newString
*/

import java.util.Scanner;

public class LatashaDavisTownsendcit130_pa8A { // tests Month class

   // create global scanner for all methods
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args){
   
      //create new Month Objects
      Month anyMonth = new Month();
   
   
   
   }

   // purpose: Class that defines the characteristics and attributes of Month
   // returns: Void
   // parameters: Void
   public static class Month {
      //declare variables
      public int monthNumber;
      public String monthName;
   
      Month(){
         // initalize constructor
      
      }
   
      // purpose:  sets the monthNumber field to 1 if Month no-arg
      // returns:
      // parameters:
      public void setMonthNumber(){
         monthNumber = 1;
      } // end setMonthNumber no-arg
   
      // purpose: constructor accepts the monthNumber field if Month arg value is 1-12, else sets monthNumber to 1
      // returns:
      // parameters:
      public void setMonthNumber(int num){
         if (num < 1 || num > 12) {
            monthNumber = 1;
         }
      } // end setMonthNumber int
   
      // purpose: sets the monthNumber field to numeric month is the name (January, February)
      // returns:
      // parameters:
      public void setMonthNumber(String name){
      
         name = toCapitalCase(name); // converts name to first letter capital
      
         switch (name) {
            case "January":
               monthNumber = 1;
               break;
            case "February":
               monthNumber = 2;
               break;
            case "March":
               monthNumber = 3;
               break;
            case "April":
               monthNumber = 4;
               break;
            case "May":
               monthNumber = 5;
               break;
            case "June":
               monthNumber = 6;
               break;
            case "July":
               monthNumber = 7;
               break;
            case "August":
               monthNumber = 8;
               break;
            case "September":
               monthNumber = 9;
               break;
            case "October":
               monthNumber = 10;
               break;
            case "November":
               monthNumber = 11;
               break;
            case "December":
               monthNumber = 12;
               break;
            default:
               monthNumber = 1;
               break;
         } //end switch case
      } // end setMonthNumber String constructor
   
   
   } // end Month Class

   // purpose:
   // returns:
   // parameters:
  /* public static int setMonthName(String name){

   }
*/
   // purpose:
   // returns:
   // parameters:
   public static void setMonthNumber(int number){
   
   }

   // purpose: a method that gets the numerical month from the keyboard
   // returns: int newNumber
   // parameters: void
   public static int getMonthNumber(){
      // declare variable
      int newNumber;
   
      // get input from keyboard
      do {
         System.out.println("Enter a month number to create an object - enter -99 when done");
         newNumber = input.nextInt();
      } while (newNumber != -99);
   
      return newNumber;
   }

   // purpose: a method that gets the name from the keyboard
   // returns: String newName
   // parameters: void
   public static String getMonthName(){
      //declare variables
      String newName;
   
      // get input from keyboard
   
      System.out.println("Enter the name of a Month - enter done when done");
      newName = input.next();
      newName = toCapitalCase(newName);
      if (setMonthNumber(newName) != 1) {
         return newName;
      }
      else 
         return "January";
   } // end getMonthName

   // purpose: converts to first letter capital
   // returns: String newString
   // parameters: String name
   public static String toCapitalCase(String name) {
      // declare variable
      char[] firstChar; // for first character in string
      char[] convertString; //holds capitalized string
      String newString;
   
      //initalize variables
      firstChar = new char[name.length()];
      convertString = new char[name.length()]; //holds the capitalized string
   
      // converts name to capital case so the first letter can be saved
      name = name.toUpperCase();
      firstChar[0] = name.charAt(0);
      name = name.toLowerCase(); // converts name to lower case
   
      convertString[0] = firstChar[0]; // converts firstChar to String and concantenates convertString
      for (int count = 1; count < name.length(); count++){
         convertString[count] = name.charAt(count);
      }
      newString = convertString.toString(); // converts char array to String
   
      return newString;
   }


}
