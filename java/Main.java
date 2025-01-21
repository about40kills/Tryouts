//Opoku Davis
// 3406422
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] evenNumbers = new int[10];

        
        for (int i = 0; i < 10; i++) {
            evenNumbers[i] = 2 * (i + 1);
        }

        
        System.out.println("Array Contents: " + Arrays.toString(evenNumbers));

        
        double sum = 0;
        for (int num : evenNumbers) {
            sum += num;
        }
        double mean = sum / evenNumbers.length;

        double sumOfSquares = 0;
        for (int num : evenNumbers) {
            sumOfSquares += Math.pow(num - mean, 2);
        }

        double variance = sumOfSquares / evenNumbers.length;
        double standardDeviation = Math.sqrt(variance);

        
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}