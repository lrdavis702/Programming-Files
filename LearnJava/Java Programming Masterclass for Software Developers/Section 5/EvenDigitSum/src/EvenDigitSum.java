public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int sum = 0;
        int remainingNumbers = number;
        int digit;

        if (number < 0) return -1;
        while (remainingNumbers > 0) {
            digit = remainingNumbers % 10;
            remainingNumbers /= 10;

            if (digit % 2 == 0) sum += digit;
        }
        return sum;
    }
}

