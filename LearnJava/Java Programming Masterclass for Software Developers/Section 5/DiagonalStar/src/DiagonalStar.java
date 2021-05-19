public class DiagonalStar {

    public static void printSquareStar(int number) {

        int currentRow = 0;

        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int rowCount = 0; rowCount < number; rowCount++) {
                //prints first and last lines/the number of stars = number
                if (currentRow == number - 1 || rowCount == 0) {
                    for (int columnCount = 0; columnCount < number; columnCount++) System.out.print("*");
                    currentRow++;
                }

                //starts a new line after the first row
                if (rowCount == 0) System.out.println();

                //creates a loop, printing stars or spaces for each column until column = number
                if (currentRow < number - 1) {
                    for (int columnCount = 0; columnCount < number; columnCount++) {
                        if (columnCount == 0 || columnCount == currentRow || columnCount == number - currentRow - 1)
                            System.out.print("*");
                        else if (columnCount == number - 1) System.out.println("*");
                        else System.out.print(" ");
                    }
                    currentRow++;
                }

            }
        }
    }
}
