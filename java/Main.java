import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize array
        int[] evenNumbers = new int[10];

        // Populate array with even numbers
        for (int i = 0; i < 10; i++) {
            evenNumbers[i] = 2 * (i + 1);
        }

        // Display array contents
        System.out.println("Array Contents: " + Arrays.toString(evenNumbers));

        // Calculate standard deviation
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

        // Display standard deviation
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}