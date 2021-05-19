import java.util.Scanner;

public class InputCalculator {

        public static void inputThenPrintSumAndAverage (){

            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            double average = 0l;
            int count = 0;

            while(true){

//                System.out.println("Please enter a number: ");
                boolean hasNextInt = scanner.hasNextInt();

                if(hasNextInt){
                    count++;
                    sum += scanner.nextInt();
                    scanner.nextLine();
                }
                else break;
            }

            average = sum / (double)count;
            long roundAvg = Math.round(average);

            System.out.println("SUM = " + sum + " AVG = " + roundAvg);
            scanner.close();
        }
    }