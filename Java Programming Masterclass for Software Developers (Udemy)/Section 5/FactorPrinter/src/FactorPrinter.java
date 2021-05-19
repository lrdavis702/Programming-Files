public class FactorPrinter {

    public static void printFactors(int number) {


        /*initializes factor to 1 because the first factor
        that can divide into a number is 1*/

        int factor = 1;
        String printString = ""; //initializes the string for printing

        /*checks to see if the number pased is greater than 1.
        If it's not, print the error message "Invalid Value"
         */
        if (number < 1) System.out.println("Invalid Value");

        /*starts the while loop. number is whatever was passed.
        the factor is initally set to 1 (see above). As long as
        the number is less than the factor, continue the loop.
         */
        while (number >= factor) {

            /*if the number divided by the factor leaves no
            remainder, add the factor to the printString. For
            example, the factor is one. The printString is
            initializy blank. If there's no remainder (which
            there should be, the new printString should be
            "1 ". The " " adds a space to the end of the string.
            If the next factor is 2 and there's no remainder, it'll
            the new printString will be "1 2 "
             */
            if (number % factor == 0) {
                printString += factor + " ";
            }
            factor++; //increment factor by 1.
        }
        System.out.println(printString); // print the completed string
    }
}
