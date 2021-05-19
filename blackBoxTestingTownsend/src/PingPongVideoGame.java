import java.util.Scanner;

public class PingPongVideoGame {

    static Scanner input = new Scanner(System.in); // create global scanner

    public static void main(String[] args) {

        // declare variables
        boolean player1First; // determines if player 1 starts or not
        int numOfPlayers = 2;
        boolean gameOverFlag = false ;

        Player[] playerArray = new Player[numOfPlayers]; // create constructor array for players


        if(initializeGame(playerArray)) {
            System.out.println(playerArray);
            pressStartButton(playerArray);
            System.out.println(playerArray);
            initalizeServer(playerArray);
            System.out.println(playerArray);
        }
        else gameOverFlag = true;

        while(!gameOverFlag || !gameOver(playerArray))
            if (!successfulVolley()) {
                for (int count = 0; count < playerArray.length; count++) {
                    if (!playerArray[count].getStartButton()) {
                        playerArray[count].getPoints();
                        System.out.println(playerArray);
                    }
                }
            } else {
                while (volley(playerArray)) {
                    System.out.println(playerArray);
                }
            }
    }

    private static void initalizeServer(Player[] playerArray) {
        for (int count = 0; count < playerArray.length; count++) {
            if(playerArray[count].getStartButton()){
                playerArray[count].setServeButton(true);
                playerArray[count].setHitButton(true);
            }
        }
    }

    // randomly determines which player hits the start button first
    public static void pressStartButton(Player playerArray[]) {
        double p1Value; // random number for player 1 to check who plays first
        double p2Value; // random number for player 1 to check who plays first

        p1Value = Math.random();
        p2Value = Math.random();

        if(p1Value > p2Value) {
            playerArray[0].setStartButton(true);
        }
        else {
            playerArray[1].setStartButton(true);
        }
    }

    public static boolean initializeGame(Player playerArray[]) {
        String answer;
        Player playerDefault = new Player(false, false, false, false, 0, "Player1");

        do{
            System.out.println("Do you want to start a new game? (Y/N)");
            answer = input.next();
            answer = answer.toUpperCase();
            for (int count = 0; count < playerArray.length; count++) {
                playerArray[count] = playerDefault;
                if (count == 1) playerArray[1].setPlayerName("Player 2");
            }

            if(answer.charAt(0) != 'Y' && answer.charAt(0) != 'N')
                System.out.println("ERROR: Enter Y/N");
            if(answer.charAt(0) == 'Y') return true;

        } while(answer.charAt(0) != 'Y' && answer.charAt(0) != 'N');
        return false;
    }

    private static boolean gameOver(Player playerArray[]) {
        if (playerArray[0].getPoints() >= 11 || playerArray[1].getPoints() >= 11) {
            if (Math.abs(playerArray[0].getPoints() - playerArray[1].getPoints()) >= 2) {
                if(playerArray[0].getPoints() > playerArray[1].getPoints()){
                    System.out.println(playerArray[0].getPoints() + " wins!");
                }
                else System.out.println(playerArray[1].getPoints() + " wins!");

                return true;
            }
        }
        return false;
    }

    public static boolean successfulVolley(){
        double ranNum; // determines how long the ball is in air

        ranNum = (Math.random() * (1.5)) ; // creates random number 0-2
        if(ranNum > 1)
            return false;
        return true;
    }

    public static boolean volley(Player playerArray[]) {
        while(successfulVolley()) {
            for (int count = 0; count < playerArray.length; count++) {
                if (playerArray[count].getHitButton()) {
                    playerArray[count].setHitButton(false);
                } else playerArray[count].setHitButton(true);
            }
            return true;
        }
        for (int count = 0; count < playerArray.length; count++) {
            if(playerArray[count].getHitButton()){
                playerArray[count].getPoints();
            }
        }
        return false;
    }
}



