import java.util.Scanner;
public class BBTExtraCredit {
    static Scanner input = new Scanner(System.in); // global scanner

    public static void main(String[] args) {
        // declare and initalize variables
        boolean noPlay = false;
        String answer;
        char entry;
        int activePlayer = 0;
        String winner;

        // create constructor for BBTExtraCredit
        Player defaultPlayer = new Player("Player 1", false, false, false, false, 0);
        Player[] playerArray = new Player[2];

        do {
            playerArray[0] = new Player("Player 1", false, false, false, false, 0);
            playerArray[1] = new Player("Player 2", false, false, false, false, 0);
            if (!startNewGame())
                noPlay = false;
            else
                for (int count = 0; count < playerArray.length; count++)
                    playerArray[count].setStartButton(true);

            activePlayer = pressStartFirst();
            playerArray[activePlayer].setServerButton(true);
            playerArray[activePlayer].setHitButton(true);

            do {
                System.out.println(playerArray[activePlayer].getPlayer() + " is serving");

                if (servePingPong()) {
                    while (volley(playerArray)) {
                        switchHitters(playerArray);
                    }
                }
                else {
                    switchServers(playerArray);
                }

                if (endGame(playerArray)) {
                    defaultPlayer = pickWinner(playerArray);
                    System.out.println("The winner is " + defaultPlayer.getPlayer() + " !");
                    System.out.println(playerArray[0]);
                    System.out.println(playerArray[1]);
                }
            }while(!endGame(playerArray));
        }while(isReset());
    }

    private static boolean startNewGame() {
        String entry;
        char answer;

        System.out.print("Do you want to start a new game? (Y/N) ");
        entry = input.next();
        entry = entry.toUpperCase();
        answer = entry.charAt(0);

        while (answer != 'Y' && answer != 'N') System.out.println("ERROR: Enter Y/N");
        if (answer == 'N') return false;
        else return true;
    }

    private static int pressStartFirst() {
        double p1Value; // random number for player 1 to check who plays first
        double p2Value; // random number for player 2 to check who plays first

        p1Value = Math.random() * 10;
        p2Value = Math.random() * 10;

        System.out.println("Player 1 hit the button in " + p1Value + " seconds");
        System.out.println("Player 2 hit the button in " + p2Value + " seconds");

        if (p1Value > p2Value) {
            System.out.println("Player 1 wins the serve!");
            return 0; // index for player 1
        } else {
            System.out.println("Player 2 wins the serve!");
            return 1; // index for player 2
        }
    }

    private static boolean servePingPong(Player[] playerArray) {
        double ranNum; // determines how long the ball is in air

        ranNum = (Math.random() * (3)); // creates random number 0-3
        if (ranNum > 1) {
            System.out.println("Failure!");
            awardPoints(playerArray);
            return false;
        }
        System.out.println("Success!");
        return true;
    }

    private static boolean volley(Player[] playerArray) {
        double ranNum; // determines how long the ball is in air
        int activePlayer = 0;
        for(int count = 0; count < playerArray.length; count++){
            if(!playerArray[count].isHitButton())
                activePlayer = count;
        }

        ranNum = (Math.random() * (10)); // creates random number 0-10
        if (ranNum > (Math.random() * (6))) {
            System.out.println(playerArray[activePlayer].getPlayer() + " swings and misses.");
            awardPoints(playerArray);
            return false;
        }
        System.out.println(playerArray[activePlayer].getPlayer() + " hits the ping pong!");
        return true;
    }

    private static void switchHitters(Player[] playerArray) {
        for(int count = 0; count < playerArray.length; count++){
            if(!playerArray[count].isHitButton()) {
                playerArray[count].setHitButton(true);
            }
            else playerArray[count].setServerButton(false);
        }
    }

    private static void awardPoints(Player[] playerArray) {
        System.out.println(playerArray[0]);
        System.out.println(playerArray[1]);
        if(playerArray[0].isHitButton() == true){
            playerArray[0].getScore();
        }
        else playerArray[1].getScore();
    }

    public static void switchServers(Player[] playArray) {
        for(int count = 0; count < playArray.length; count++){
            if(!playArray[count].isServerButton()) {
                playArray[count].setServerButton(true);
            }
            else playArray[count].setServerButton(false);
        }
    }

    public static boolean endGame(Player[] playerArray) {
        if(playerArray[0].getScore() > 10 || playerArray[1].getScore() > 10)
            if(Math.abs(playerArray[0].getScore() - playerArray[1].getScore()) > 2)
                return true;
                return false;
        }

    public static Player pickWinner(Player[] playerArray) {
        if(playerArray[0].getScore() > playerArray[1].getScore())
            return playerArray[0];
        return playerArray[1];
    }

    public static boolean isReset() {
        String winner;
        String answer;
        char entry;

        System.out.println("Do you want to reset the game? (Y/N)");
        answer = input.next();
        answer = answer.toUpperCase();
        entry = answer.charAt(0);

        if (entry != 'Y' && entry != 'N')
            System.out.println("ERROR: Enter Y/N");
        else if (entry == 'Y') {
            return true;
        }
        return false;
    }
}



