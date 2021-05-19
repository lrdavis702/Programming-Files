package edu.kennesaw.seclass;

public class ProblemClass {
   public static void main (String[] args){
      // declare variables
      boolean aBoolean = true;
      boolean bBoolean = true;
      double x;
      double y;
   
      System.out.println("//Task 1//");
      System.out.println("***ProblemClassTestBC1a***");
      System.out.println("Possible to have less than 100% and show fault");
      System.out.println("but not also have 100% and not show fault. See method.");
      System.out.println("\n***ProblemClassTestBC1b***");
      System.out.println("See above and method");
   
      System.out.println("\n//Task 2//");
      System.out.println("***ProblemClassTestBC2a***");
      x = 0;
      y = 1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod2(x,y));
   
      x = 0;
      y = 0;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod2(x,y));
   
      x = 0;
      y = -1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod2(x,y));
   
      System.out.println("\n***ProblemClassTestBC2b***");
      x = 0;
      y = 1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod2(x,y));
   
      x = 0;
      y = 0;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod2(x,y));
   
      System.out.println("\n//Task 3//");
      System.out.println("***ProblemClassTestBC3a***");
      x = 0;
      y = 1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod3(x,y));
   
      x = 0;
      y = -1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod3(x,y));
   
      System.out.println("\n***ProblemClassTestBC3b***");
      x = 0;
      y = 1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod3(x,y));
   
      x = 0;
      y = 0;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod3(x,y));
   
      x = 0;
      y = -1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod3(x,y));
   
      System.out.println("\n//Task 4//");
      System.out.println("***ProblemClassTestBC4a***");
      x = 0;
      y = 1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod4(x,y));
   
      x = 0;
      y = 0;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod4(x,y));
   
      x = 0;
      y = -1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod4(x,y));
   
      System.out.println("\n***ProblemClassTestBC4a***");
      x = 1;
      y = 1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod4(x,y));
   
      x = -1;
      y = 1;
      System.out.println("x = " + x + " and y = " + y);
      System.out.println(problemMethod4(x,y));
   
      System.out.println("\n//Task 5//");
   
      System.out.println(" ================");
      System.out.println("");
      System.out.println(" Replace the \"?\" in column “output” with “T”, “F”, or “E”:");
      System.out.println("");
      System.out.println(" | a | b |output|");
      System.out.println(" ================ ");
      System.out.print(" | T | T |   " );
      if(ProblemMethod5(true, true)) System.out.print("T");
      else if(!ProblemMethod5(true, true)) System.out.print("F");
      else System.out.print("E");
      System.out.println("  |");
      System.out.print(" | T | F |   " );
      if(ProblemMethod5(true, false)) System.out.print("T");
      else if(!ProblemMethod5(true, false)) System.out.print("F");
      else System.out.print("E");
      System.out.println("  |");
      System.out.println(" | F | T |   E  |");
      System.out.print(" | F | F |   " );
      if(ProblemMethod5(false, false)) System.out.print("T");
      else if(!ProblemMethod5(false, false)) System.out.print("F");
      else System.out.print("E");
      System.out.println("  |");
      System.out.println(" ================");
   
      System.out.println(" Replace the \"?\" in the following sentences with “NEVER”,");
      System.out.println(" “SOMETIMES” or “ALWAYS”:");
      System.out.println("");
      System.out.println(" - Test suites with 100% statement coverage “SOMETIMES”");
      System.out.println("   reveal the fault in this method.");
      System.out.println(" - Test suites with 100% branch coverage “SOMETIMES”");
      System.out.println("   reveal the fault in this method.");
      System.out.println(" - Test suites with 100% path coverage “ALWAYS”");
      System.out.println("   reveal the fault in this method.");
      System.out.println(" ================");
   
   }

   /* Task 1: Create in class ProblemClass a method called problemMethod1
   that contains a division by zero fault such that (1) it is possible to
   create a test suite with less than 100% branch coverage that reveals the
   fault, and (2) it is possible to create a test suite that achieves 100%
   branch coverage and does not reveal the fault.
    */
   public static String problemMethod1(double x, double y){
      /* It's possible to create a test suite with less than 100% coverage
      that reveals a fault. For example [0, 1] and [0, 0] reveal a fault
      but it is not full coverage as it does not take into account the
      unmentioned else statement (do nothing). However, full coverage will
      reveal the fault [0, 1], [0, 0], and [0, -1]. It would not be 100% coverage
      without [x,0]
   
      if ( y > 0 ) {
          status = "y is > than 0: x / y = " + (x / y);
      }
      else if (y < 0) {
          status = "y is < than 0: x / y = " + (x / y);
      }
      return status + (x / y);
       */
      return "";
   }

   /*Task 2: Create in class ProblemClass a method called problemMethod2
   that contains a division by zero fault such that (1) every possible test
   suite that achieves 100% branch coverage does not reveal the fault (and
   it must be possible to create at least one test suite with 100% branch
   coverage), and (2) it is possible to create a test suite that achieves
   less than 100% branch coverage and reveals the fault.
    */
   public static String problemMethod2(double x, double y){
      String status = "";
      if ( y > 0 ) {
         status = "y is > than 0: x / y = " + (x / y);
      }
      else if (y < 0) {
         status = "y is < than 0: x / y = " + (x / y);
      }
      else status = "y = 0";
      return status + (x / y);
   }

   /*Task 3: Create in class ProblemClass a method called problemMethod3
   that contains a division by zero fault such that (1) every possible test
   suite that achieves less than 100% statement coverage does not reveal the
   fault, and (2) every possible test suite that achieves 100% statement
   coverage reveals the fault.
    */
   public static String problemMethod3(double x, double y){
      String status = "";
      if (y > 0) status = "x / y = ";
   
      return status + (x / y);
   }

   /*Task 4: Create in class ProblemClass a method called problemMethod4 that
   contains a division by zero fault such that (1) every possible test suite
   that achieves 100% statement coverage reveals the fault, and (2) it is
   possible to create a test suite that achieves 100% path coverage and does
   not reveal the fault.
    */
   public static String problemMethod4(double x, double y){
      if(y == 0 || x > 0)
         return "x / y = " + (x / y);
      else 
         return "y is not 0 and x is not > 0)";
   }

   /*Task 5: Add to class ProblemClass the method ProblemMethod5 provided here,
   including the final, commented part (i.e., the table and the fill in the
   blank statements). Fill in your answers in the method, as follows:
    */
   public static boolean ProblemMethod5(boolean a, boolean b) {
      int x = 2;
      int y = 0;
      if(a)
         x = y;
      else
         x = 2*x;
      if(b)
         y = 4;
      else
         y -= 5;
      return ((4/(x-y)) >= 0);
   }
}
