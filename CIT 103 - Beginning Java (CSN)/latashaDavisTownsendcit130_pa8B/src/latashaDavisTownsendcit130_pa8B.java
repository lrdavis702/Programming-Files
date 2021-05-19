// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa8b.java
// @version The date as 2021-04-05
// @brief This is a program to practice with the basic concepts of OOP
// using the Class Pool: The class should have private instance fields
// to store the shape of a pool (oval, rectangular, etc.), length (in feet),
// width (in feet), depth (in feet), area (in square feet) and the volume
// (in cubic feet) of the pool. Also includes the following methods:
// display (displays output), (isNumeric/convertStringToInt)checks for valid int
// @note 4 hour 28 minutes taken to develop, write, test and debug
// solution.

/* Pseudocode

*MAIN CLASS
    CREATE new pool object
    INVOKE method to get user input, return pool parameters
    PRINT pool parameters

    INPUT from user (number of pools)
    FOR (counter < number of pools)
        INVOKE method to get user input
            PRINT pool parameters
    INCREASE counter
    END FOR LOOP
*END MAIN CLASS

*REQUEST INPUT Method
    INPUT from users (dimensions)
    CREATE Pool object
    INITIALIZE Pool object with dimensions
    RETURN Pool object
END REQUEST INPUT Method
 */

import java.util.Scanner;

// purpose: source file for testing swimming pool class
// parameters: N/A
// returns:
public class latashaDavisTownsendcit130_pa8B {

    // define new global scanner
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // declare variables
        int numOfPools;

        // create new Pool object (format suggested by IDE)
        new latashaDavisTownsendPool.Pool();
        latashaDavisTownsendPool.Pool newPool;

        // invokes method to get data input from user
        newPool = requestInput();

        // print Pool object #1 data
        System.out.println(newPool.toString());

        // gets number of pools to process; did not need array
        System.out.print("How many pools to process in the array? ");
        numOfPools = convertStringToInt();

        // create an array of pools
        latashaDavisTownsendPool.Pool[] poolArray = new latashaDavisTownsendPool.Pool[numOfPools];

        // for loop Invokes method to get user input then prints results
        for(int count = 0; count < numOfPools; count++){
            // initialize poolArray
            poolArray[count] = requestInput();
            poolArray[count].display();
        } // end For Loop
    } // end main

    // purpose: gets input from users on dimensions of pool
    // parameters: void
    // returns: Class latashaDavisTownsendPool.Pool
    public static latashaDavisTownsendPool.Pool requestInput(){
        // declare variables
        String newShape;
        int newLength;
        int newWidth;
        int newDepth;

        // requests dimensions from the user & validates length, width, depth are numeric
        System.out.print("Enter the shape of a pool: ");
        newShape = input.next();
        System.out.print("Enter the length of a pool: ");
        newLength = convertStringToInt();
        System.out.print("Enter the width of a pool: ");
        newWidth = convertStringToInt();
        System.out.print("Enter the depth of a pool: ");
        newDepth = convertStringToInt();

        // creates and returns object with parameters for Pool
        return new latashaDavisTownsendPool.Pool(newShape, newLength, newWidth, newDepth);
    } // end requestInput

    // purpose: checks to make sure values are numeric
    // parameters: String testValue
    // returns: boolean
    public static boolean isNumeric(String testValue) {

        // checks to see if user entered a value
        if (testValue == null || testValue.equals("")) {
            return false;
        }

        // checks each character in string to ensure it's numeric
        for (int count = 0; count < testValue.length(); count++) {
            // declare variables
            char c;
            c = testValue.charAt(count);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        // if String is numeric, returns true
        return true;
    } // end isNumeric

    // purpose: converts a numeric string to an int
    // parameters: none
    // returns: int numString
    public static int convertStringToInt(){
        // declare variables
        String numString;

        do { // gets input from user at least once
            numString = input.next();
            if (!isNumeric(numString)) { // invokes isNumeric to check if number
                // gives error message if not numeric or positive
                System.out.print("ERROR: Enter a positive number: ");
            }
        }while (!isNumeric(numString)); // ends do/while loop when number is valid
        return Integer.parseInt((numString)); // returns valid number as an int
    } // end convertStringToInt
} // end class