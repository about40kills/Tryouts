

public class EvenNumbersArray {

    public static void main(String[] args) {
        // Create an array to store the even numbers
        int[] evenNumbers = new int[10];

        // Initialize the array with the first 10 even numbers
        for (int i = 0; i < 10; i++) {
            evenNumbers[i] = 2 * (i + 1);
        }

        // Display the contents of the array on screen
        System.out.println("The contents of the array are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(evenNumbers[i]);
        }

        // Calculate the standard deviation of the even numbers
        double standardDeviation = calculateStandardDeviation(evenNumbers);

        // Display the standard deviation value on screen
        System.out.println("The standard deviation of the even numbers is: " + standardDeviation);
    }

    // Calculate the standard deviation of an array of numbers
    public static double calculateStandardDeviation(int[] numbers) {
        // Calculate the mean of the numbers
        double mean = 0;
        for (int number : numbers) {
            mean += number;
        }
        mean /= numbers.length;

        // Calculate the sum of the squared differences between each number and the mean
        double sumOfSquaredDifferences = 0;
        for (int number : numbers) {
            sumOfSquaredDifferences += Math.pow(number - mean, 2);
        }

        // Calculate the standard deviation
        double standardDeviation = Math.sqrt(sumOfSquaredDifferences / (numbers.length));

        return standardDeviation;
    }
}
