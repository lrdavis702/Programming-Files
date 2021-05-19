// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file latashaDavisTownsendcit130_Pa10.java
// @version The date as 2021-04-26
// @brief a program to process some employee data. We will gather user input
// from the keyboard, validate entries, write data to f ile, and read data
// from file and calculate pay.
// @note 4 hours 58 minutes taken to develop, write, test and debug
// solution.

/* psuedocode
MAIN METHOD
 INVOKE employeeRecords Method
 IF file exists
   INVOKE employeePay Method
   INVOKE writeData Method
   INVOKE employeeRecords Method
   IF file exists
      INVOKE getRecordNumber Method
   ENDIF
 ENDIF

employeeRECORDS Method
   IF record exists
      RETURN record file
   ELSE
      DISPLAY error message
      RETURN record file

calculatePay Method
   FOR loop
      WHILE fileInput hasNext
         name = fileInput
         hours = fileInput
         rate = fileInput

         ADD data to employee ArrayList
      ENDWHILE
   ENDFOR
   RETURN employeePay

writeData Method
   DOWHILE user continues to input data
      GET name from keyboard
      DOWHILE user input errors
         TRY GET hours from keyboard
         CATCH mismatch exception
      ENDDOWHILE
      DOWHILE User input errors
         TRY GET rate from keyboard
         CATCH mismatch exception
      ENDDOWHILE
  ENDDOWHILE

getRecordNumber Method
   DOWHILE user input errors
      TRY GET valid record number
      CATCH no such element
      CATCH mismatch excdeption
   ENDDOWHILE
   IF valid input
      DISPLAY record
   ENDIF
*/
import java.util.*;
import java.io.*;

public class latashaDavisTownsendcit130_Pa10 {
   static Scanner input = new Scanner(System.in);

   public static void main(String [] args) throws FileNotFoundException {
   
      // declare variables
      String fileName = "Emp.txt"; // string storing the name of the file
   
      // declare and initalize objects
      ArrayList<Integer> employeeHours = new ArrayList<Integer>();
      ArrayList<Double> employeeRate = new ArrayList<Double>();
      ArrayList<Double> employeePay = new ArrayList<Double>();
      ArrayList<String> employeeName = new ArrayList<String>();
      File file = new File(fileName); // creates an object and assigns it to fileName
   
      file = employeeRecords(); // invokes method that gets the name of employee record file
      if (file.exists()) { // if employee record file exists continues code
         employeePay = calculatePay(file, employeeName, employeeHours, employeeRate, employeePay);
         writeData(); // invokes method to write data to file
         input.nextLine(); // discard input
      
         file = employeeRecords(); // invokes method that gets the name of employee record file
         if (file.exists()) { // if employee record file exists, gets record to display
            getRecordNumber(file);
         }
      }
   }

   // purpose: checks to see if employee record file exists and initializes file for use
   // parameters: void
   // return: File
   public static File employeeRecords() {
      // declare variables
      String keyboardInput; // generic variable for getting keyboard input
   
      File recordFile = null;
      // gets the name of the input file from keyboard
      System.out.println("Enter the file name to read data from");
      keyboardInput = input.nextLine();
      recordFile = new File(keyboardInput);
      if(recordFile.exists()){
         return recordFile;
      }
      else{
         System.out.println("Can't find your input file: " + recordFile +
                " - Terminating the program");
      }
      return recordFile;
   }

   // purpose: calculates pay for employee (rate * hours)
   // parameters: File, ArrayList, ArrayList, ArrayList, ArrayList
   // return: ArrayList
   public static ArrayList<Double> calculatePay(File file, ArrayList<String> employeeName, ArrayList<Integer> employeeHours,
                                                ArrayList<Double> employeeRate, ArrayList<Double> employeePay)
           throws FileNotFoundException {
   
      Scanner fileInput = new Scanner(file); // creates scanner object for file
   
      for (int count = 0; count < employeeName.size(); count++) {
         while (fileInput.hasNext()) {
            String name = fileInput.next();
            int hours = fileInput.nextInt();
            double rate = fileInput.nextDouble();
         
            employeeName.add(name);
            employeeHours.add(hours);
            employeeRate.add(rate);
            employeePay.add(rate * hours);
         }
      }
      return employeePay;
   }

   // purpose: gets input from keyboard and writes it to a file
   // parameters: void
   // return: void
   public static void writeData() throws FileNotFoundException {
      //declare variables
      String name;
      int hours;
      double rate;
      String moreRecords;
      boolean continueInput;
      
   // initalize variables
      rate = 0;
      hours = 0;
      // write formatted output to the file
   
      System.out.println("Enter the file name to write to");
      // for storing file name from keyboard input
      String fileName = input.next(); // get file name from keyboard
   
      File file = new File(fileName); //set file to file name from keyboard
      PrintWriter output = new PrintWriter(file); // allows writing to object     
      
      do{
         continueInput = true; // initialize boolean for exception
      
         System.out.print("Enter employee name: " );
         name = input.next();
         output.print(name + "\t");
         
         // validates user input for integer
         do{
            try{   
               System.out.print("Enter employee hours: ");
               hours = input.nextInt();
               output.print(hours + "\t");
               continueInput = false;
            
            }
            catch(InputMismatchException ex){
               System.out.println("Try again. (Incorrect input: an integer is required)");
               input.nextLine(); // discard input
            }
         } while (continueInput);
         
         continueInput = true; // initialize boolean for exception
       
         // validates user input for double
         do{
            try{     
               System.out.print("Enter employee rate: ");
               rate = input.nextDouble();
               output.print(rate + "\t");
               continueInput = false;
            }
            
            catch(InputMismatchException ex){
               System.out.println("Try again. (Incorrect input: an number is required)");
               input.nextLine(); // discard input
            }
         } while (continueInput);
         
         output.print(rate * hours + "\n");
      
         do {
            System.out.println("Do you wish to enter another employee record? Y/N ");
            moreRecords = input.next();
            moreRecords.toLowerCase();
            
         // validates for y or n
            if(moreRecords.charAt(0) != 'n' && moreRecords.charAt(0) != 'y'){
               System.out.println("Please enter Y or N");
            }
            
         } while(moreRecords.charAt(0) != 'n' && moreRecords.charAt(0) != 'y');
         
      } while(moreRecords.charAt(0) != 'n'); // loops until keyboard = n
   
      output.close(); // closes file
   }

   // purpose: allows user to enter a record number and display the results
   // parameters: File
   // return: void
   public static void getRecordNumber(File file) throws FileNotFoundException {
   //declare variables
      int keyboardEntry; // generic variable for accepting keyboard input
      String name;
      int hours;
      double rate;
      boolean continueInput;
      boolean validRecord;
      
      // initialize variables
      hours = 0;
      rate = 0;
      continueInput = false;
      name = "";
      keyboardEntry = 0;
      validRecord = false;
   
      Scanner fileInput = new Scanner(file); // creates scanner object for file
   
      // validates that user input is in range and an integer
      do{
         try{
            System.out.println("Enter an index number for the record to be located: ");
            keyboardEntry = input.nextInt();
            for(int count = 0; count < keyboardEntry; count++) {
               name = fileInput.next();
               hours = fileInput.nextInt();
               rate = fileInput.nextDouble();
               validRecord = true;
               continueInput = false; 
            }
         }
         
         catch (InputMismatchException ex){
            System.out.println("Try again. (Incorrect input: an integer is required)");
            input.nextLine(); // discard input
            continueInput = true;
         }
         
         catch (NoSuchElementException ex){
            System.out.println("Requested Index is out of bounds."); 
            input.nextLine(); // discard input
            validRecord = false;
            continueInput = true;
         }
      }while(continueInput);
      
      if(validRecord){
         System.out.println("Employee name: " + name + "\tHours worked: " + hours +
                  "\tPay rate: " + rate + "\tFinal Pay: " + (hours * rate));
      }       
   }
}

