// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.
public class Multiples3And5 {
    public static void main(String[] args) {
        // declare & initialize variables
        int sum = 0; // used to keep track of the sum

        // loop that identifies numbers divisible by 3 or 5 and adds those numbers to the sum
        for (int count = 0; count < 1000; count++) {
            if (count % 3 == 0 || count % 5 == 0) {
                sum += count;
            }
        }
        System.out.println("The sum is " + sum); // prints out the sum
    }
}
