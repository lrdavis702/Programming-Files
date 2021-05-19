package com.company;

public class Main {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) System.out.println("This is a positive number");
        else if (number < 0) System.out.println("This is a negative number");
        else if (number == 0) System.out.println("The number is zero");
    }
}
