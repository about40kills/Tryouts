import java.util.*;

public class PhonebookStudents {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store student information
        ArrayList<Student> students = new ArrayList<>();

        // Create a HashMap to store the frequency of occurrence of each holiday destination rating
        HashMap<Integer, Integer> holidayDestinationRatings = new HashMap<>();

        // Keep prompting the user for student information until they enter "z" or until they have finished entering all student information
        while (true) {
            System.out.println("Enter student name (or \"z\" to finish): ");
            String name = scanner.nextLine();

            // Check if the user entered "z" to finish
            if (name.equalsIgnoreCase("z")) {
                break;
            }

            // Prompt the user for the student's phone number
            System.out.println("Enter student phone number: ");
            String phoneNumber = scanner.nextLine();

            // Prompt the user for the student's holiday destination rating
            System.out.println("Enter student holiday destination rating (1-7): ");
            int holidayDestinationRating = scanner.nextInt();

            // Create a new Student object and add it to the ArrayList
            Student student = new Student(name, phoneNumber, holidayDestinationRating);
            students.add(student);

            // Update the frequency of occurrence of the holiday destination rating
            int count = holidayDestinationRatings.getOrDefault(holidayDestinationRating, 0);
            holidayDestinationRatings.put(holidayDestinationRating, count + 1);
        }

        // Display the count of how many students' names and phone numbers were entered
        System.out.println("Total number of students: " + students.size());

        // Display the count of the frequency of occurrence of each holiday destination rating in descending order
        System.out.println("Frequency of occurrence of holiday destination ratings:");
        List<Integer> sortedRatings = new ArrayList<>(holidayDestinationRatings.keySet());
        Collections.sort(sortedRatings, Collections.reverseOrder());
        for (Integer rating : sortedRatings) {
            System.out.println(rating + ": " + holidayDestinationRatings.get(rating));
        }

        // Display the name, phone number, and holiday destination rating for each student
        System.out.println("Student information:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Phone Number: " + student.getPhoneNumber());
            System.out.println("Holiday Destination Rating: " + student.getHolidayDestinationRating());
            System.out.println();
        }
        scanner.close();
    }
}

class Student {

    private String name;
    private String phoneNumber;
    private int holidayDestinationRating;

    public Student(String name, String phoneNumber, int holidayDestinationRating) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.holidayDestinationRating = holidayDestinationRating;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getHolidayDestinationRating() {
        return holidayDestinationRating;
    }
}
