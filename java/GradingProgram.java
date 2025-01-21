// without taking imput from user
 
public class GradingProgram {
   public static void main(String[] args) {
       // Student details
       int[] studentNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
       int[] indexNumbers = {10021007, 10021107, 10021207, 10021307, 10021407, 10021507, 10021607, 10021707, 10021807, 10021907, 10022007, 10022107, 10022207, 10022307, 10022407};
       int[] midSemMarks = {65, 48, 22, 32, 80, 12, 45, 25, 33, 67, 23, 45, 56, 34, 81};
       int[] examsMarks = {78, 54, 90, 32, 66, 60, 48, 65, 45, 56, 33, 45, 67, 90, 67};
 
       int numStudents = studentNumbers.length;
 
       int[] finalScores = new int[numStudents];
       char[] grades = new char[numStudents];
 
       // Calculate final scores and grades
       for (int i = 0; i < numStudents; i++) {
           finalScores[i] = calculateFinalScore(midSemMarks[i], examsMarks[i]);
           grades[i] = calculateGrade(finalScores[i]);
       }
 
       // Output the final score, grade, and calculate statistics
       int sum = 0;
       int maxScore = Integer.MIN_VALUE;
       int minScore = Integer.MAX_VALUE;
 
       int[] gradeFrequency = new int[6]; // Assuming A, B, C, D, E, F
 
       System.out.println("\nIndex\tFinal Score\tGrade");
       for (int i = 0; i < numStudents; i++) {
           System.out.printf("%d\t\t%d\t\t\t%c\n", indexNumbers[i], finalScores[i], grades[i]);
 
           // Update statistics
           sum += finalScores[i];
           maxScore = Math.max(maxScore, finalScores[i]);
           minScore = Math.min(minScore, finalScores[i]);
 
           // Update grade frequency
           gradeFrequency[grades[i] - 'A']++;
       }
 
       // Calculate and output average score
       double averageScore = (double) sum / numStudents;
       System.out.println("\nAverage Score: " + averageScore);
 
       // Output maximum and minimum scores
       System.out.println("Maximum Score: " + maxScore);
       System.out.println("Minimum Score: " + minScore);
 
       // Output grade frequency
       System.out.println("\nGrade Frequency:");
       char grade = 'A';
       for (int frequency : gradeFrequency) {
           System.out.println(grade + ": " + frequency);
           grade++;
       }
   }
 
   // Function to calculate final score
   private static int calculateFinalScore(int midSemMarks, int examsMarks) {
       return (int) (0.3 * midSemMarks + 0.7 * examsMarks);
   }
 
   // Function to calculate grade based on KNUST grading system
   private static char calculateGrade(int score) {
       if (score >= 80) return 'A';
       else if (score >= 70) return 'B';
       else if (score >= 60) return 'C';
       else if (score >= 50) return 'D';
       else if (score >= 40) return 'E';
       else return 'F';

    
   }
}