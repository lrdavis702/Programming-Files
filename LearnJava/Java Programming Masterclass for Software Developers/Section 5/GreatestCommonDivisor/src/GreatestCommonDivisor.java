public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int firstInt, int secondInt) {

//        int divisor = 1;
//        int greatestCD = -1;
//
//        if (firstInt < 10 || secondInt < 10) return -1;
//
//        while (firstInt >= divisor && secondInt >= divisor) {
//            if (firstInt % divisor == 0 & secondInt % divisor == 0) {
//                greatestCD = divisor;
//            }
//            divisor++;
//        }
//        return greatestCD;

        //  int divisor = 1;
        int greatestCD = -1;

        if (firstInt < 10 || secondInt < 10) return -1;

        for (int divisor = 1; firstInt >= divisor && secondInt >= divisor; divisor++) {
            if (firstInt % divisor == 0 & secondInt % divisor == 0) {
                greatestCD = divisor;
            }
        }
        return greatestCD;
    }
}
