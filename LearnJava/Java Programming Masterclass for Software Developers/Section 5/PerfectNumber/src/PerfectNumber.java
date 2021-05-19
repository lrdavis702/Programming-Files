public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        int sum = 0;

        if(number > 0) {
            for (int divisor = 1; number > divisor; divisor++) {
                if (number % divisor == 0) sum += divisor;
            }
            if (sum == number) return true;
        }
        return false;
    }
}
