public class NumberToWords {

    public static void numberToWords(int number) {

        String printNumberString = "";
        int extractedNumber;

        if (number < 0) System.out.println("Invalid Value"); /*this is my check for negative numbers.
        the else statement doesn't run if it's a negative number*/
        else if (number == 0) System.out.println("Zero");
        else {

            int tempNumber = reverse(number);
            int reverseNumberCount = getDigitCount(tempNumber);
            int originalNumberCount = getDigitCount(number);

            while (tempNumber > 0) {
                extractedNumber = tempNumber % 10;

                switch (extractedNumber) {
                    case 0:
                        printNumberString += "Zero ";
                        break;
                    case 1:
                        printNumberString += "One ";
                        break;
                    case 2:
                        printNumberString += "Two ";
                        break;
                    case 3:
                        printNumberString += "Three ";
                        break;
                    case 4:
                        printNumberString += "Four ";
                        break;
                    case 5:
                        printNumberString += "Five ";
                        break;
                    case 6:
                        printNumberString += "Six ";
                        break;
                    case 7:
                        printNumberString += "Seven ";
                        break;
                    case 8:
                        printNumberString += "Eight ";
                        break;
                    case 9:
                        printNumberString += "Nine ";
                        break;
                }
                tempNumber /= 10;
            }
            while (originalNumberCount > reverseNumberCount) {
                printNumberString += "Zero ";
                reverseNumberCount++;
            }
            System.out.println(printNumberString);
        }
    }

    public static int reverse(int number) {
        int tempNumber = number;
        int newNumber = 0;
        int extractedNumber;

        while (tempNumber != 0) {
            extractedNumber = tempNumber % 10;
            newNumber *= 10;
            newNumber += extractedNumber;
            tempNumber /= 10;
        }
        return newNumber;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;

        if (number == 0) digitCount = 1;
     //   else if (number < 0) digitCount = -1; //why is this line needed if I checked for negative numbers above?
        else {
            for (int tempNumber = number; tempNumber != 0; digitCount++) {
                tempNumber /= 10;
            }
        }
        return digitCount;
    }

}