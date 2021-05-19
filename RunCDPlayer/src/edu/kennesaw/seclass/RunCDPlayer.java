package edu.kennesaw.seclass;

public class RunCDPlayer {
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
