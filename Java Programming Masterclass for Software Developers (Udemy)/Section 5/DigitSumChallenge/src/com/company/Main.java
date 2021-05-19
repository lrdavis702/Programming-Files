package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
//        int number1;
//        int number2;
//        int number3 = number;
//        System.out.println("original number: " + number);
//
        //checks to see if it's a value number before running the rest of the method
        if (number < 10) return -1;
//
//        //gets value for 1st digit and prints
//        System.out.print(number1 = number / 100);
//
//        //gets value for 2nd digit and prints
//
//        number2 = number % 100;
//        number2 = number2 / 10;
//        System.out.print(" + " + number2);
//
//        //gets value for 3rd digit and prints
//        number3 = number % 10;
//        System.out.print(" + " + number3 + " = ");
//
//        return number1 + number2 + number3;
        //125 --> 125 / 10 = 12 --> 12 * 10 = 120 --> 125 - 120 = 5
        int sum = 0;
        int digit = number;
        while (digit > 0) {
            sum += digit % 10;
            digit /= 10;
        }
        return sum;
    }
}