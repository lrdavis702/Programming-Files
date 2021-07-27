package DesignPatterns;

import java.util.Scanner;

public class FactoryTest {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String entry = "0";
        char c;
        String type = null;

        do{
            System.out.println("*****Type Identification*****");
            System.out.println("Enter N for National Student");
            System.out.println("Enter I for International Student");
            System.out.println("Enter X to exit System");
            c = letterConversion(entry);

            if (c != 'n' && c != 'i' && c != 'x')
                System.out.println("Please chose from one of the options below");

            else if (c == 'n') {
                type = "National";
            } else if (c == 'i') {
                type = "International";
            }
            else if (c == 'x') {
                System.out.println("System Exiting");
                System.exit(0);
            }
        } while (c != 'n' && c != 'i');

        do {
            System.out.println("*****Level Classification*****");
            System.out.println("Enter G for Graduate Student");
            System.out.println("Enter U for Undergraduate Student");
            System.out.println("Enter X to exit");

            c = letterConversion(entry);

            if (c != 'g' && c != 'u' && c != 'x')
                System.out.println("Please chose from one of the options below");

            else if (c == 'g') {
                University gradSchool = new GraduateSchool();
                Student studentGrad1 = gradSchool.registerStudent(type);
                System.out.println(studentGrad1.toString());
            } else if (c == 'u') {
                University undergradSchool = new UndergradSchool();
                Student studentUndergrad1 = undergradSchool.registerStudent(type);
                System.out.println(studentUndergrad1.toString());
            }
        } while (c != 'x');
    }
    public static char letterConversion(String n){
        n = input.nextLine();
        n = n.toLowerCase();
        return n.charAt(0);
    }
}