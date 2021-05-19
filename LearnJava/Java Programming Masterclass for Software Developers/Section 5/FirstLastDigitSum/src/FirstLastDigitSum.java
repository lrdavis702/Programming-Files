public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int remainingNumbers = number;
        int firstDigit = number % 10;

        if (number < 0) return -1;
        while (remainingNumbers >= 10) {
            remainingNumbers /= 10;
        }
        return remainingNumbers + firstDigit;
    }
}
