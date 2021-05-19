// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa8.java
// @version The date as 2021-03-26
// @brief This is a program to practice with the basic concepts
// of OOP by testing various operations on the objects of a class
// called Month
// @note 8 hour 34 minutes taken to develop, write, test and debug
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

import java.util.Arrays; // IDE suggestion to convert char to String
import java.util.Scanner;

// purpose: utility class to test Month constructors
// returns: none
//parameters: none
public class LatashaDavisTownsendcit130_pa8A {

    // create global scanner for all methods
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {

        Month anyMonth1 = new Month(); // create new Month Object for numeric constructor
        System.out.println("Using the no-arg constructor, month number = " + anyMonth1.monthNumber);

        Month anyMonth2 = new Month(5); // create new Month Object for overload constructor
        anyMonth2.setMonthNumber(5);
        System.out.println("Using the constructor with an argument, month number = " + anyMonth2.monthNumber);

        // checks to see if monthNumber == -99. If yes, end while and continue; else loop
        while(anyMonth2.monthNumber != -99) {
            anyMonth2.setMonthNumber(anyMonth2.monthNumber);
            if(anyMonth2.monthNumber != -99) {
                System.out.println("The month number set is: " + anyMonth2.monthNumber);
            }
            anyMonth2.getMonthNumber();
        } // end while

        Month anyMonth3 = new Month(""); // create new Month Object for name constructor
        // checks to see if monthName == "Done". If yes, end while; else loop
        do {
            anyMonth3.setMonthName(anyMonth3.monthName);
            if (!anyMonth3.monthName.equals("Done")) {
                System.out.println("The month name set is: " + anyMonth3.monthName);
                System.out.println("The number set is: " + (anyMonth3.monthNumber + 1));
                anyMonth3.getMonthName();
            }
        } while(!anyMonth3.monthName.equals("Done")); // end DoWhile loop
    } // end main

    // purpose: create Month class for testing different parameters
    // returns: none
    // parameters: none
    public static class Month {
        public int monthNumber;
        public String monthName;

        // purpose: Initialize Month constructor with no arg
        // returns: void
        // parameters: none
        public Month() {// default constructor set the initial value
            monthNumber = 1;
        }

        // purpose: Initialize overload Month constructor
        // returns: void
        // parameters: int anyNumber
       public Month(int anyNumber){
           monthNumber = anyNumber;
       }

       // purpose: Initialize overload Month constructor
       // returns: void
       // parameters: String newString
       public Month(String newString){
           monthName = getMonthName();
       }

       // setters for setMonthName & setMonthNumber

        /* purpose: method that accepts an integer argument to assign to the
         monthNumber field. Set the monthNumber to 1 if the passed argument’s
         value is not a value between 1 and 12.*/
        // returns: void
        // parameters: String anyString
        public void setMonthName(String anyString){

            // create an array of months
            String[] monthArray; // creates an array of months
            boolean validMonth; // determine if valid month

            // initialize variables
            monthArray = new String[]{"January", "February", "March", "April", "May",
                    "June", "July", "August", "September", "October", "November", "December"};
            validMonth = false;

            monthName = toCapitalCase(anyString); // Invokes method to capitalize first letter only

            // checks to see if the month is valid
            for (int counter = 0; counter < 12; counter++){
                if (monthName.equals(monthArray[counter])) {
                    monthName = monthArray[counter];
                    validMonth = true;
                    monthNumber = counter;
                }
            }

            // allows "Done" to pass through to finish program
            if(monthName.equals("Done")){
                monthName = monthName;
            }
            // monthName = January if not a valid month
            else if(!validMonth) {
                monthName = monthArray[0];
                monthNumber = 0;
            }
        } // end setMonthName

        /* purpose: accepts the name, such as “January” as an argument and sets
        the monthNumber field to the correct corresponding value. Make sure
        this is not case sensitive, so entering “January” will return the same
        value as if “JaNUary” was entered. If an invalid month is entered, set
        the monthNumber to 1.*/
        // returns: void
        // parameters: int anyNumber
        public void setMonthNumber(int anyNumber) {
            if (anyNumber == -99) {
                monthNumber = anyNumber;
            }
            else if (anyNumber < 1 || anyNumber > 12) {
                monthNumber = 1;
            }
            else {
                monthNumber = anyNumber;
            }
        } // end setMonthNumber

       //getters for getMonthName & getMonthNumber

        /*purpose: A getMonthName method that returns the name of the month.
        For example, if the monthNumber field is 1, then this method will
        return “January”. Note that this method does not accept any parameters.
         It looks up the monthNumber field to make its decision.*/
        // returns: String monthName
        // parameters: none
       public String getMonthName() {
           System.out.println("Enter the name of a Month - enter done when done");
           monthName = input.next();

           return monthName;
       } // en getMonthName

        /*purpose: A getMonthNumber method that returns the value in the
         monthNumber field.*/
        // returns: int monthNumer
        // parameters: none
        public int getMonthNumber() {
            System.out.println("Enter a month number to create an object - enter -99 when done");
            monthNumber = convertInt(); // invokes method to validate numeric entry

            return monthNumber;
        } // end getMonthNumber
   } // end Month class

    // auxiliary methods for handing exceptions and conversions

    // purpose: converts to first letter capital
    // returns: String newString
    // parameters: String name
    public static String toCapitalCase(String name) {

        // declare variable
        char firstChar; // for first character in string
        char[] convertString; //holds capitalized string
        String newString; // place to reenter individual characters
        String removeCommas; // String to hold string without commas

        //initalize variables
        convertString = new char[name.length()];
        removeCommas = "";

        // converts name to capital case so the first letter can be saved
        name = name.toUpperCase();
        firstChar = name.charAt(0);
        name = name.toLowerCase(); // converts name to lower case

        convertString[0] = firstChar; // converts firstChar to String and concantenates convertString
        for (int count = 1; count < name.length(); count++){
            convertString[count] = name.charAt(count);
        }

        // converts char array to String - IDE suggestion for Arrays.toString()
        newString = Arrays.toString(convertString);

        // removes nonalphabetic characters
        for(int counter = 0; counter < newString.length(); counter++){
            if(newString.charAt(counter) != ',' && newString.charAt(counter) != ' '
                    && newString.charAt(counter) != '[' && newString.charAt(counter) != ']'){
                removeCommas += newString.charAt(counter); // places alphabetic characters into string
            }
        }
        return removeCommas;
    } // end toCapitalCase method

    // used code from here: https://www.techiedelight.com/determine-string-valid-number-java/
    // made modifications to allow for negative integers
    // purpose: determine if string is numeric
    // returns: boolean
    // parameters: String s
    public static boolean isNumeric(String s) {
        if (s == null || s.equals("")) {
            return false;
        }

        // loops, verifying characters are numeric
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // allows for first character of string to be -
            if(i == 0 && c == '-'){
                ;
            }
            else if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    } // end isNumeric

    // purpose: converts string to int
    // returns: int entry
    // parameter: none
    public static int convertInt(){
        // declare variable
        String entry;

        do {
            entry = input.next();
            if (!isNumeric(entry)){
                System.out.print("Enter an integer: ");
            }
        } while (!isNumeric(entry));
        return Integer.parseInt(entry); // converts string to int pp.384-385
    } // end convertInt
} // end utility class
