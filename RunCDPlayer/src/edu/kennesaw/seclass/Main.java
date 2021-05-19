package edu.kennesaw.seclass;

import java.util.Scanner;

public static void main(String []args) {
        char button;
        String playerStatus;
        boolean workingPlayer = true;
        boolean openPlayer = false;
        boolean playing = false;
        boolean loadedCD = false;
        char putCD;

        Scanner input = new Scanner(System.in);
        printStatus(openPlayer, playing, loadedCD);

        do {
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
        } while (workingPlayer);
        }