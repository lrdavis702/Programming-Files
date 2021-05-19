public class LargestPrime {

    public static int getLargestPrime(int number) {

        int primeNumber = -1;
        boolean isPrimeNumber = true;
        System.out.println("number = " + number);

        if (number > 1) {
            for (int divisor = 2; divisor <= number; divisor++) {

                if (number % divisor == 0)
                    for (int i = 2; i <= divisor / 2; i++)
                        if (divisor % i == 0) isPrimeNumber = false;

                if (isPrimeNumber && number % divisor == 0) primeNumber = divisor;

                else if (isPrimeNumber && divisor == number) {
                    primeNumber = divisor;
                    break;
                }
            }
        }

        return primeNumber;
    }
}