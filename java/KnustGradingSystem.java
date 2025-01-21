// Opoku Davis 
// Index: 3406422
import java.util.Scanner;

public class KnustGradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students took the test?");
        int NumofStudents = scanner.nextInt();
        scanner.nextLine();

        String[] indexNumbers = new String[NumofStudents];
        int[] finalScores = new int[NumofStudents];
        char[] grades = new char[NumofStudents];

        final double thirtyPercent = 0.30;//constants are declared by prefixing "final" to their datatype
        final double seventyPercent = 0.70;

        int sumFinalScores = 0; 
        int maxScore = Integer.MIN_VALUE; 
        int minScore = Integer.MAX_VALUE;       
        int[] gradeFrequency = new int[6]; 
        for (int i = 0; i < NumofStudents; i++) {
            System.out.println("\nEnter the details of student " + (i + 1) + ":");

            System.out.println("Enter index number: ");
            indexNumbers[i] = scanner.nextLine();

            System.out.println("Enter mid-semester score:");
            double midSemScore = scanner.nextInt();
            System.out.println("Enter exam score:");
            double examScore = scanner.nextInt();
            scanner.nextLine();

            double cMidSemScore = midSemScore * thirtyPercent;
            double cExamScore = examScore * seventyPercent;
            double finalScore = cMidSemScore + cExamScore;
            finalScores[i] = (int) Math.round(finalScore);

            sumFinalScores += finalScores[i]; 
            maxScore = Math.max(maxScore, finalScores[i]);
            minScore = Math.min(minScore, finalScores[i]);

            char grade;
            if (finalScores[i] >= 70)
                grade = 'A';
            else if (finalScores[i] >= 60)
                grade = 'B';
            else if (finalScores[i] >= 50)
                grade = 'C';
            else if (finalScores[i] >= 40)
                grade = 'D';
            else
                grade = 'F';

            
            switch (grade) {
                case 'A':
                    gradeFrequency[0]++;
                    break;
                case 'B':
                    gradeFrequency[1]++;
                    break;
                case 'C':
                    gradeFrequency[2]++;
                    break;
                case 'D':
                    gradeFrequency[3]++;
                    break;

                case 'F':
                    gradeFrequency[5]++;
                    break;
            }

            grades[i] = grade;
        }

        double averageScore = (double) sumFinalScores / NumofStudents;

        System.out.println("\nINDEX NO\tFINAL SCORE\tGRADE ");
        for (int i = 0; i < NumofStudents; i++) {
            System.out.println(indexNumbers[i] + "\t\t" + finalScores[i] + "\t\t" + grades[i]);
        }

        System.out.println("\nAverage Score: " + averageScore);
        System.out.println("Maximum Score: " + maxScore);

        System.out.println("Minimum Score: " + minScore);

        System.out.println("\nGrade Frequency:");
        char[] gradeLabels = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < gradeFrequency.length; i++) {
            System.out.println(gradeLabels[i] + ": " + gradeFrequency[i]);

            scanner.close();
        }
    }
}