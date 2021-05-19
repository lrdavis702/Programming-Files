import java.util.Scanner;

public class CDPlayer {
    public static void main(String []args) {
        char button;
        String playerStatus;
        boolean workingPlayer = true;
        boolean openPlayer = false;
        boolean playing = false;
        boolean loadedCD = false;
        char putCD;
        char breakCD = 'N';

        Scanner input = new Scanner(System.in);
        printStatus(openPlayer, playing, loadedCD);

            while (workingPlayer) {
                printButtons();
                System.out.print("Select a button: ");
                button = input.next().charAt(0);
                if (button != '1' && button != '2' && button != '3')
                    System.out.println("Incorrect selection. Choose 1, 2 or 3");
                else if (button == '1') {
                    openPlayer = openOrCloseButton(openPlayer);
                    if (openPlayer && !loadedCD) {
                        System.out.println("Put in CD? (Y/N)");
                        putCD = input.next().charAt(0);
                        if (putCD == 'Y' || putCD == 'N')
                            loadedCD = hasCD(loadedCD);
                    }
                }

                else if (button == '2' && !openPlayer && loadedCD)
                    playing = playButton(playing);
                else if (button == '3' && playing)
                    playing = false;
                printStatus(openPlayer, playing, loadedCD);
                System.out.print("Smash CD Player? (Y/N)");
                        breakCD = input.next().charAt(0);
                if(breakCD == 'Y') {
                    workingPlayer = false;
                    System.out.println("Great job, bozo! You broke it!");
                }
            }
    }



        public static boolean openOrCloseButton(boolean openOrClosed){
            return !openOrClosed;
        }

        public static boolean playButton(boolean playing){
            return !playing;
        }

        public static void printStatus(boolean playerOpen, boolean playerPlaying, boolean hasCD){
            String isOpen = "Open";
            String isPlaying = "Playing";
            String loadedCD = "has";

            if(!playerOpen) isOpen = "Closed";
            if(!playerPlaying) isPlaying = "Stopped";
            if(!hasCD) loadedCD = "does not have";

            System.out.println("The Player is " + isOpen + " and " + loadedCD + " a CD and " + isPlaying);
        }

        public static boolean hasCD(boolean loadedCD){
            return !loadedCD;
        }

        public static void printButtons(){
            System.out.println(" ____________________________________________________");
            System.out.println("| (1) Open/Close  |     (2) Play      |    (3)Stop   |");
            System.out.println(" ----------------------------------------------------");
        }

}
