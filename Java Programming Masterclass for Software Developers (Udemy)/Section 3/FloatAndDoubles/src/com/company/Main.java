package com.company;

public class Main {

    public static void main(String[] args) {
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println ("Float minimum value = " + myMinFloatValue);
    System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println ("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("The myIntValue is " + myIntValue);
        System.out.println("The myFloatValue is " + myFloatValue);
        System.out.println("The myDoubleValue is " + myDoubleValue);
    }
}
