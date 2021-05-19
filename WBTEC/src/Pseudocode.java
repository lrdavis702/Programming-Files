import java.util.Scanner;

public class Pseudocode {
    public static void main(String[] args){

        // create scanner
        Scanner input = new Scanner(System.in);

        // declare and initalize variables
        int x;

        x = input.nextInt();
        square(x);
    }

    public static int square(int x) {
        int n = 1;
        int y = 1;

        if (x == 0)
            return x;
        if (x < 0)
            x = -1 * x;
        while (x > 1){
            n = n + 2;
            y = y + n;
            x = x - 1;
        }
        return y;
    }
}
