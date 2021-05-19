package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (counter < 10) {
            System.out.print("Enter number #" + (counter + 1) + ": ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
                continue;
            }
            scanner.nextLine(); // handles the enter key
        }
        System.out.println("The total is " + sum);
        scanner.close();
    }
}