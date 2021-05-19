package com.company;

import java.sql.SQLOutput;

public class Main {

   public static void main(String[] args) {
   
   //        for (int count = 2; count < 9; count++) {
   //            System.out.println("$10,000 at " + count + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, count)));
   //        }
   //
   //        System.out.println("***********");
   //
   //        for (int count = 8; count >= 2; count--) {
   //            System.out.println("$10,000 at " + count + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, count)));
   //        }
   //
   //        System.out.println("***********");
      int count = 0;
      for (int number = 150; number < 300; number++) {
         if (isPrime(number)) {
            System.out.println(number + " is a prime number");
            count++;
         }
      }            System.out.println("There are " + count + " prime numbers.");
   
   }

   public static double calculateInterest(double amount, double interestRate) {
      return (amount * (interestRate / 100));
   }

   public static boolean isPrime(int n) {
      if (n == 1) {
         return false;
      }
      for (int i = 2; i <= n / 2; i++) {
         if (n % i == 0) {
            return false;
         }
      }
      return true;
   }
}
