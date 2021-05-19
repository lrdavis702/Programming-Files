import java.util.ArrayList;

public class DiscussionQuestion {
    public static void main(String[] args) {
        ArrayList<String> newString = new ArrayList<String>();
        ArrayList<Integer> newInteger = new ArrayList<Integer>();
        randomNumberArrayList();
        for (int count = 0; count < 500; count++){
            newString.add((count + 1) + "");
        }
        q2(newString, newInteger);
    }

    public static void randomNumberArrayList(){
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        for (int count = 0; count < 500; count++) {
            randomNumbers.add(1 + (int) (Math.random() * 100));
        }
    }

    public static void q2(ArrayList<String> newString, ArrayList<Integer> newInteger){
        for (int count = 0; count < newInteger.size(); count++){
            System.out.println("Element " + (count) + " String: " + newString.get(count) +
                    " Integer: " + newInteger.get(count));
            count++;
        }
    }
}
