// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa8b.java
// @version The date as 2021-04-05
// @brief This is a program to practice with the use of inheritance in java.
// The class ExamScore should have 2 private instance fields to store the
// name of an exam and the score for an exam. The StudentScore inherits
// from the ExamScore and has one attribute to store the identification
// number for the student. The main program (test class) to test various
// operations on the objects of the ExamScore and StudnetScore classes.
// Also includes the following method: (isNumeric/convertStringToInt)checks
// for valid integers.
// @note 3 hour 18 minutes taken to develop, write, test and debug
// solution.

/* Pseudocode
START MAIN
    CREATE ExamScore constructor
    PRINT ExamScore constructor

    CREATE StudentScore constructor
    PRINT StudentScore constructor

    GET name from super class
    GET score from super class
    PRINT ExamScore constructor

    GET studentID from StudentScore
    PRINT StudentScore constructor

    FORLOOP (while counter < 5)
        CREATE StudentScore constructor Array
        SET random studentID
        Current Index Array = StudentScore constructor
        PRINT Current Index Array
 */

import java.util.Scanner;
public class Pa9A {

   // create global scanner
   public static Scanner input = new Scanner(System.in);

   public static void main(String[] args){
   
      // create constructor for ExamScore
      ExamScore exam1 = new ExamScore("Exam 1", 100);
      System.out.println(exam1);
   
      // create constructor for StudentScore
      StudentScore student1 = new StudentScore(1000);
      System.out.println(student1);
   
      // get name & score from ExamScore
      exam1.getName();
      exam1.getScore();
      System.out.println("just updated information for an exam");
      System.out.println(exam1); // prints ExamScore
   
      student1.getIdNum(); // get ID number from Student Score
      System.out.println("just updated information for an exam");
      System.out.println(student1); // prints StudentScore
   
      // populates constructor Array
      for(int count = 0; count <5; count++){
         StudentScore[] studentArray = new StudentScore[5]; // create constructor array
         student1.setIdNum((int)(Math.random() * (1000 - 100 + 1)) + 100); // creates random number 100-1000
         studentArray[count] = student1; // fills constructor array
         System.out.println(studentArray[count]); // prints constructor array
      } // end for loop
   } // end main class

   // purpose: checks to see if the number is numeric
   // returns: boolean
   // parameters: String
   public static boolean isNumeric(String entry) {
   
      // checks to see if user inters a value
      if (entry == null || entry.equals("")) {
         return false;
      }
   
      // checks each character for nonnumeric value
      for (int count = 0; count < entry.length(); count++) {
         char c;
         c = entry.charAt(count);
         if (c < '0' || c > '9') {
            return false;
         }
      } // end for loop
   
      // if all characters >=0 && <= 9, entry = numeric
      return true;
   } // end isNumeric

   // purpose: converts numerical String into int
   // returns: int
   // parameters: void
   public static int convertStringToInt() {
      String entry;
   
      do { // gets input from user at least once
         entry = input.next();
         if (!isNumeric(entry)) { // invokes isNumeric to check for numeric value
            // error message if not numeric
            System.out.println("ERROR: Enter a positive number");
         } // end if
      } while (!isNumeric(entry)); // continue loop until valid numeric number
   
      return Integer.parseInt(entry); // returns String as numeric value
   } // end convertStringToInt
} // end program
