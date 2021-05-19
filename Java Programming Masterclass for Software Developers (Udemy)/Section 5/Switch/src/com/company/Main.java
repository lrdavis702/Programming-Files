package com.company;

public class Main {

    public static void main(String[] args) {
//	int value = 3;
//	if(value == 1) System.out.println("Value was 1");
//	else if(value == 2) System.out.println("Value was 2");
//	else System.out.println("Was not 1 or 2");

        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'c';

        switch(charValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The value is " + charValue + ".");
                break;

            default:
                System.out.println("Value not found");
                break;
        }
    }
}
