import java.util.*;

public class PhonebookStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> studentInfo = new HashMap<>();
        Map<Integer, Integer> ratingFrequency = new HashMap<>();
        int totalStudents = 0;

        while (true) {
            try {
                System.out.print("Enter student name (or 'z' to finish): ");
                String name = input.nextLine().trim();

                if (name.equalsIgnoreCase("z")) {
                    break;
                }

                System.out.print("Enter student phone number: ");
                String phoneNumber = input.nextLine().trim();

                System.out.print("Enter holiday destination rating (1-7): ");
                int rating = input.nextInt();
                input.nextLine(); // Consume newline

                if (rating < 1 || rating > 7) {
                    System.out.println("Invalid rating. Please enter a number between 1 and 7.");
                    continue;
                }

                // Update student info
                studentInfo.put(name, phoneNumber);

                // Update rating frequency
                ratingFrequency.put(rating, ratingFrequency.getOrDefault(rating, 0) + 1);

                totalStudents++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid data.");
                input.nextLine(); // Consume invalid input
            }
        }

        // Display total number of students
        System.out.println("\nTotal students entered: " + totalStudents);

        // Display rating frequency
        System.out.println("\nHoliday destination rating frequency:");
        for (int i = 1; i <= 7; i++) {
            System.out.println("Rating " + i + ": " + ratingFrequency.getOrDefault(i, 0));
        }

        // Search for a student by name
        while (true) {
            System.out.print("\nEnter student name to search (or 'q' to quit): ");
            String searchName = input.nextLine().trim();

            if (searchName.equalsIgnoreCase("q")) {
                break;
            }

            if (studentInfo.containsKey(searchName)) {
                String phoneNumber = studentInfo.get(searchName);
                System.out.println("Phone number for " + searchName + ": " + phoneNumber);
            } else {
                System.out.println("Student not found.");
            }
        }

        System.out.println("\nThank you for using the Student Info App!");
        input.close();
    }
}    