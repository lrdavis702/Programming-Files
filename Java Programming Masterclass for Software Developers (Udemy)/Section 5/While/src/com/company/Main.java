package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber && count != 5) {
            number++;
            if (!isEvenNumber(number)) continue;

            System.out.println("Even number " + number);
            count++;
        }
        System.out.println("Total number of even numbers are " + count);
    }
//        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("************");
//
//        for (count = 0; count != 5; count++) {
//            System.out.println("Count value is " + count);
//        }
//
//        System.out.println("************");
//        count = 0;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while (count != 6);

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) return true;
        return false;
    }
}

