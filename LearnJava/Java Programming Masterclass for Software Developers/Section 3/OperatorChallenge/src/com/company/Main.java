package com.company;

public class Main {

    public static void main(String[] args) {
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double firstResults = (firstDouble + secondDouble) * 100.00;
        double remainder = firstResults % 40.00;
        boolean isZero = remainder == 0 ? true : false;
        System.out.println(isZero);
        if(!isZero){
            System.out.println("Got some remainder");
        }
    }
}
