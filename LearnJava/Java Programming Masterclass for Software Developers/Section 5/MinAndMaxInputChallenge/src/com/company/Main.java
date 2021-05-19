package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int min = 0;
        int max = 0;

        while (true) {
            System.out.print("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                if (count == 0) {
                    min = number;
                    max = number;
                    count++;
                }

                if (number > max) max = number;
                if (number < min) min = number;

                scanner.nextLine();
            } else break;
        }

        scanner.close();
        System.out.println("The max number is " + max);
        System.out.println("The min number is " + min);
    }
}
