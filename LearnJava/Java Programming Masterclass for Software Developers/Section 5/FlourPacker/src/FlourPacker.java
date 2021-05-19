public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int sum = 0;

        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        if(smallCount > 5){
            bigCount = bigCount + (smallCount / 5) - 1;
            smallCount = smallCount % 5 + 5;
        }

        for (sum = 0; bigCount != 0 && sum + smallCount < goal; bigCount--)
            sum += 5;

        for (sum = sum; smallCount != 0 && sum < goal; smallCount--)
            sum++;

        return sum == goal;
    }
}
