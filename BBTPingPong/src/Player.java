import java.sql.PreparedStatement;
import java.util.Scanner;

public class Player {
    public static Scanner input = new Scanner(System.in);

    // declare variables
    private String player;
    private boolean startButton;
    private boolean serverButton;
    private boolean hitButton;
    private boolean reset;
    private int score;

    Player(){
        this.player = "Player 1";
        this.startButton = false;
        this.startButton = false;
        this.hitButton = false;
        this.reset = false;
        this.score = 0;
    }

    Player (String player, boolean startButton, boolean serverButton, boolean
            hitButton, boolean reset, int score){
        this.player = player;
        this.startButton = startButton;
        this.serverButton = serverButton;
        this.hitButton = hitButton;
        this.reset = reset;
        this.score = score;
    }

    public void setHitButton(boolean hitButton) {
        this.hitButton = hitButton;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public void setServerButton(boolean serverButton) {
        this.serverButton = serverButton;
    }

    public void setStartButton(boolean startButton) {
        this.startButton = startButton;
    }

    public int getScore() {
        score++;
        return score;
    }

    public boolean isHitButton(){
        return hitButton;
    }

    public boolean isReset (){
        return reset;
    }

    public boolean isStartButton(){
        return startButton;
    }

    public boolean isServerButton(){
        return serverButton;
    }

    public String getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "*The score for " + player + " is " + score + " points!";
    }
}
