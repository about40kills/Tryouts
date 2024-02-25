import java.util.Scanner;

public class OddTables {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array = new int[3][3];
        int[] oddNumbers = new int[9];
        System.out.println("Enter the first 9 odd numbers:");
        for (int i = 0; i < 9; i++) {
            int number = input.nextInt();
            if (number % 2 != 0) {
                oddNumbers[i] = number;
            } else {
                System.out.println("Please enter an odd number.");
                i--;
            }
        }
        int z = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = oddNumbers[z];
                z++;
            }
        }

        int leadingDiagonalProduct = array[0][0] * array[1][1] * array[2][2];
        int trailingDiagonalProduct = array[0][2] * array[1][1] * array[2][0];
        int difference = trailingDiagonalProduct - leadingDiagonalProduct;

        array[0][1] = leadingDiagonalProduct;
        array[1][1] = difference;

        array[2][1] = trailingDiagonalProduct;

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
        }
        double average = (double) sum / 9;

        
        array[1][0] = (int) average;

        
        double sumOfSquares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumOfSquares += Math.pow(array[i][j] - average, 2);
            }
        }
        double standardDeviation = Math.sqrt(sumOfSquares / 9);

        array[1][2] = (int) standardDeviation;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (array[i][j] < array[k][l]) {
                            int temp = array[i][j];
                            array[i][j] = array[k][l];
                            array[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("The final 2D 3x3 array in descending order is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
            input.close();
        }
    }
}
