public class Player {
    //declare variables
    private boolean startButton;
    private boolean serveButton;
    private boolean hitButton;
    private boolean resetButton;
    private int points;
    String playerName;

    Player(){
        hitButton = false;
        startButton = false;
        serveButton = false;
        resetButton = false;
        points = 0;
        playerName = null;
    }

    Player(boolean startButton, boolean serveButton, boolean hitButton, boolean resetButton, int points, String playerName){
        this.hitButton = hitButton;
        this.startButton = startButton;
        this.serveButton = serveButton;
        this.resetButton = resetButton;
        this.points = points;
        this.playerName = playerName;
    }

    public void setStartButton(boolean startButton){
        this.startButton = startButton;
    }

    public void setServeButton(boolean serveButton){
        this.serveButton = serveButton;
    }

    public void setHitButton(boolean hitButton) {
        this.hitButton = hitButton;
    }

    public void setResetButton(boolean resetButton){
        this.resetButton = resetButton;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean getStartButton(){
        return startButton;
    }

    public boolean getServeButton(){
        return serveButton;
    }

    public boolean getHitButton(){
        return hitButton;
    }

    public boolean getResetButton(){
        return resetButton;
    }

    public int getPoints(){
        points++;
        return points;
    }

    public String getPlayerName(){
        return playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "startButton=" + startButton +
                ", serveButton=" + serveButton +
                ", hitButton=" + hitButton +
                ", resetButton=" + resetButton +
                ", points=" + points +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
