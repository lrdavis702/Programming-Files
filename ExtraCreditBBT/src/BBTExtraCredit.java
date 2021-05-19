import java.util.Scanner;
public class BBTExtraCredit {

    public static Scanner input = new Scanner(System.in); // global scanner

    public static void main(String[] args) {

        // declare and initalize variables
        String[] players = {"Player 1", "Player 2"};
        boolean[] startButton = {false, false};
        boolean[] serverButton = {false, false};
        boolean[] hitButton = {false, false};
        boolean reset = false;
        int[] points = {0, 0};
        boolean gameOver = false;
        String answer;
        char entry;

        do {
            entry = startGame(startButton);
        } while (entry != 'Y' && entry != 'N');

        while (!endMatch(points)) {
            if (startButton[0]) {
                hitButton[0] = true;
                System.out.println(players[0] + " serves.");
                if (successfulHit()) { // checks to see if the serve was successful
                    System.out.println(players[0] + " serves successfully.");
                    volley(hitButton, players);
                } else {
                    System.out.println(players[0] + " serves unsuccessfully.");
                    for (int count = 0; count < serverButton.length; count++) {
                        if (!serverButton[count]) {
                            System.out.println("Point goes to " + players[count]);
                            points[count]++;
                            System.out.println("Score is Player 1: " + points[0] +
                                    " and Player 2: " + points[1]);
                            serverButton[count] = true;
                            hitButton[count] = true;
                        } else {
                            serverButton[count] = false;
                            hitButton[count] = false;
                        }
                    }
                }
            }
            else {
                if (startButton[1]) {
                    hitButton[1] = true;
                    System.out.println(players[1] + " serves.");
                    if (successfulHit()) { // checks to see if the serve was successful
                        System.out.println(players[1] + " serves successfully.");
                        volley(hitButton, players);
                    } else {
                        System.out.println(players[1] + " serves unsuccessfully.");
                        for (int count = 0; count < serverButton.length; count++) {
                            if (!serverButton[count]) {
                                System.out.println("Point goes to " + players[count]);
                                points[count]++;
                                System.out.println("Score is Player 1: " + points[0] +
                                        " and Player 2: " + points[1]);
                                serverButton[count] = true;
                                hitButton[count] = true;
                            } else {
                                serverButton[count] = false;
                                hitButton[count] = false;
                            }
                        }
                    }
                }
        }
    }
}

    private static char startGame(boolean[] startButton) {
        String answer;
        char entry;
        System.out.print("Do you want to start a new game? (Y/N) ");
        answer = input.next();
        answer = answer.toUpperCase();
        entry = answer.charAt(0);

        if (entry != 'Y' && entry != 'N')
            System.out.println("ERROR: Enter Y/N");
        else if (entry == 'Y') {
            pressStartButton(startButton);
        }
        return entry;
    }

    private static boolean endMatch(int[] points) {
        if (points[0] >= 11 || points[1] >= 11) {
            if (Math.abs(points[0] - points[1]) >= 2) {
                if(points[0]  > points[1]){
                    System.out.println(points[0]  + " wins!");
                }
                else System.out.println(points[0]  + " wins!");

                return true;
            }
        }
        return false;
    }

    private static void volley(boolean[] hitButton, String[] players) {
        while (successfulHit()) {
            for (int count = 0; count < hitButton.length; count++) {
                if (!hitButton[count]) {
                    System.out.println(players[count] + " returns.");
                    hitButton[count] = true;
                } else hitButton[count] = false;
            }
        }
    }

    private static boolean successfulHit() {
        double ranNum; // determines how long the ball is in air

        ranNum = (Math.random() * (3)); // creates random number 0-2
        return !(ranNum > 1);
    }

    public static void pressStartButton(boolean[] startButton){
        double p1Value; // random number for player 1 to check who plays first
        double p2Value; // random number for player 2 to check who plays first

        p1Value = Math.random();
        p2Value = Math.random();

        if(p1Value > p2Value) {
            startButton[0] = true;
        }
        else {
            startButton[1] = true;
        }
    }
}
