public class IntEqualityPrinter {

    public static void printEqual(int intOne, int intTwo, int intThree){
        if(intOne < 0 || intTwo < 0 || intThree < 0) System.out.println("Invalid Value");
        else if(intOne == intTwo && intOne == intThree) System.out.println("All numbers are equal");
        else if(intOne != intTwo && intOne != intThree && intTwo != intThree)
        System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}
