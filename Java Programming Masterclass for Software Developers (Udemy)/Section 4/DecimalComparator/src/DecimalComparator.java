public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double firstDouble, double secondDouble){

        Math.round(firstDouble *= 1000);
        Math.round(secondDouble *= 1000);

        if((int)firstDouble == (int)secondDouble) {
            return true;
        }
        return false;
    }
}
