public class BasicLoop {
    public static void main(String [] args){
        for (int i = 1; i < 5; i++){
            for (int counter = i; counter > 0; counter--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
