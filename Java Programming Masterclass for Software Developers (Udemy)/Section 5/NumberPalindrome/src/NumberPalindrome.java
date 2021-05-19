public class NumberPalindrome {

    public static boolean isPalindrome (int number){
        int reverseNumber = 0;
        int remainingNumbers = number;
        int lastDigit;
        while(remainingNumbers != 0){
            lastDigit = remainingNumbers % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            remainingNumbers /= 10;
        }

        //System.out.println("Reverse Number = " + reverseNumber + " and Original Number = " + number);
        if (reverseNumber == number) return true;
        return false;
    }
}
