public class PrimitiveTypesChallenge {
    public static void main(String[] args){

        byte myByte = 123;
        short myShort = 12345;
        int myInt = 123456789;
        int mySum = myByte + myShort + myInt;
        long myLong = 50000L + (10L * mySum);

        System.out.println(myLong);
    }
}
