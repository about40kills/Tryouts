// A program to calculate the standard deviation of an array of even numbers
import java.util.Scanner; // Import the Scanner class to get user input

public class MyProgram {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner object
    int[] array = new int[10]; // Declare and initialize an array of size 10
    int sum = 0; // Declare and initialize a variable to store the sum of the array elements

    // Use a for loop to get the even numbers from the user and store them in the array
    System.out.println("Enter 10 even numbers:");
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextInt(); // Get the next even number from the user
      sum += array[i]; // Add the array element to the sum
    }

    // Display the contents of the array
    System.out.println("The array contains:");
    for (int i = 0; i < 10; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();

    // Calculate the mean of the array elements
    double mean = (double) sum / 10;

    // Declare and initialize a variable to store the sum of the squared differences from the mean
    double sumOfSquares = 0;

    // Use a for loop to calculate the sum of the squared differences from the mean
    for (int i = 0; i < 10; i++) {
      double difference = array[i] - mean; // Subtract the mean from the array element
      double square = difference * difference; // Square the result
      sumOfSquares += square; // Add the square to the sum of squares
    }

    // Calculate the standard deviation of the array elements
    double standardDeviation = Math.sqrt(sumOfSquares / 10);

    // Display the standard deviation
    System.out.println("The standard deviation of the array is:");
    System.out.println(standardDeviation);
  }
}