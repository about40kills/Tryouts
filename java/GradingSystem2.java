
import java.util.Scanner;

public class GradingSystem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the student's exam and assessment scores
        System.out.println("Enter your exam score:");
        int examScore = input.nextInt();

        System.out.println("Enter your assessment score:");
        int assessmentScore = input.nextInt();

        // Calculate the total grade
        int totalGrade = examScore + assessmentScore;

        // Check if the student passed the exam and assessment
        boolean passedExam = examScore >= 25;
        boolean passedAssessment = assessmentScore >= 15;

        // Check if the student is condoned
        boolean condoned = totalGrade == 39 && (examScore == 25 && assessmentScore == 14) || (examScore == 24 && assessmentScore == 15);

        // Check if the student has paid their fees in full
        System.out.println("Have you paid your fees in full? (yes/no)");
        String feesPaid = input.next();

        // Check if the student is eligible for a certificate
        boolean eligibleForCertificate = (passedExam && passedAssessment) || condoned && feesPaid.equals("yes");

        // Print the student's results
        if (eligibleForCertificate) {
            System.out.println("Congratulations! You have passed the exam and assessment and are eligible for a certificate.");
        } else if (condoned) {
            System.out.println("You have been condoned and are eligible for a certificate.");
        } else {
            System.out.println("You have failed the exam or assessment and are not eligible for a certificate.");
        }

        // Print which component the student passed/failed
        if (passedExam) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }

        if (passedAssessment) {
            System.out.println("You passed the assessment.");
        } else {
            System.out.println("You failed the assessment.");
        }

        // Check if the student is repeated
        if (!eligibleForCertificate) {
            System.out.println("You are repeated.");
        }
    }
}
