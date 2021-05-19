public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstDigit, int secondDigit, int thirdDigit){

        if(isValid(firstDigit) && isValid(secondDigit) && isValid(thirdDigit))
        if(firstDigit % 10 == secondDigit % 10 ||
                firstDigit % 10 == thirdDigit % 10 ||
                secondDigit % 10 == thirdDigit % 10) return true;
        return false;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000) return false;
        return true;
    }
}
