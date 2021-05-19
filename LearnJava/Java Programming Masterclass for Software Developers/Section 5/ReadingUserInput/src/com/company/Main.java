package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();//handle next line character (enter key)

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2020 - yearOfBirth;
            if (age > 100 || age < 1) System.out.println("Invalid year of birth");
            else
                System.out.println("Your Name is " + name + ", and you are " + age + " years old.");
        }
        else System.out.println("Unable to pass year of birth");
        scanner.close();


    }
}
