package DesignPatterns.UserRecord;

import DesignPatterns.PrintMenu;

import java.io.*;
import java.util.Scanner;

public class LoginScreen {
    static Scanner input = new Scanner(System.in);
    static String userName;
    static String password;

    public static void displayScreen() {

        String[] welcomeArray = new String[]{"Login", "Create a New Account", "Account information", "Delete Account"};
        String welcomeTitle = "Login Screen***\n***Login to order services";
        char userChoice;

        userChoice = PrintMenu.makeSelection(welcomeArray, welcomeTitle);

        if (userChoice == '1') login();
        else if (userChoice == '2') createAccount();
        else if (userChoice == '3') {
            displayAccount();
        } else if (userChoice == '4') deleteAccount();
    }

    private static void login() {
        System.out.println("Enter your user name: ");
        userName = input.nextLine();
        userName.toLowerCase();

        System.out.println("Enter your password: ");
        password = input.nextLine();

        validateCredentials(userName, password);
    }

    private static void createAccount() {
        String response;
        UserCache userCache = new UserCache();
        Prospect p = (Prospect) userCache.getUserPrototype(UserType.PROSPECT);

        System.out.println("Enter your first name: ");
        response = input.nextLine();
        p.setfName(response);

        System.out.println("Enter your last name: ");
        response = input.nextLine();
        p.setlName(response);

        System.out.println("Enter your user name: ");
        response = input.nextLine();
        response.toLowerCase();
        createUserFile(response);
        p.setUserName(response);

        System.out.println("Enter your email address: ");
        response = input.nextLine();
        p.setEmail(response);

        do {
            System.out.println("Enter your password: ");

            response = input.nextLine();
            if (response.length() < 8) {
                System.out.println("Password must be longer than 8 characters.");
            }
            p.setPassword(response);

        } while (response.length() < 8);

        System.out.println(p);
        String userRecord = (p.getType() + "," + p.getfName() + "," + p.getlName()) +
                "," + p.getUserName() + "," + p.getEmail() + "," + p.getPassword();

        writeUserfile(userRecord, p.getUserName());
    }

    private static void displayAccount() {
        login();

        String line = "";
        String splitBy = ",";
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(userName + ".rec"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] userRecord = line.split(splitBy);    // use comma as separator
                System.out.println("First Name = " + userRecord[1] + ", Last Name = "
                        + userRecord[2] + ", User Name = " + userRecord[3] + ", Email = " + userRecord[4] + "]");
            }
        } catch (IOException e) {
            displayScreen();
        }
    }

    private static void deleteAccount() {

        //toString();
        System.out.println("YOU ARE REQUESTING TO DELETE YOUR ACCOUNT");
        login();
        System.out.println("To delete your account, type: delete");
        String response = input.nextLine();

        response.toLowerCase();

        if (response.equals("delete")) {
            File deleteFile = new File(userName + ".rec");
            if (deleteFile.delete()) {
                System.out.println("Deleting account: " + userName);
            } else {
                System.out.println("Failed to delete the file.");
            }
        }

        else System.out.println("Canceled");
        displayScreen();
    }

    private static void createUserFile(String response) {
        try {
            File myObj = new File(response + ".rec");
            if (myObj.createNewFile()) {
                System.out.println("UserName Approved.");
            } else {
                System.out.println("UserName already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            displayScreen();
        }
    }

    private static void writeUserfile(String userRecord, String userName) {
        try {
            FileWriter myWriter = new FileWriter(userName + ".rec");
            myWriter.write(userRecord);
            myWriter.close();
            System.out.println("Account Successfully Created");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void validateCredentials(String userName, String password) {
        try {
            File userFile = new File(userName + ".rec");
            Scanner fileInput = new Scanner(userFile);
            fileInput.close();

        } catch (FileNotFoundException e) {
            System.out.println("User name or password incorrect.");
            displayScreen();
        }
    }
}