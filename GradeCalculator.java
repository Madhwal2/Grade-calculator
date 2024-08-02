import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the number of subjects
        int numberOfSubjects;
        
        System.out.print("Enter the number of subjects: ");
        numberOfSubjects = scanner.nextInt();

        // Array to hold scores for each subject
        double[] scores = new double[numberOfSubjects];
        double total = 0;
        
        // Input scores for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            total += scores[i];
        }

        // Calculate average score
        double average = total / numberOfSubjects;

        // Determine grade
        char grade = calculateGrade(average);

        // Display results
        System.out.println("\nTotal Score: " + total);
        System.out.println("Average Score: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Method to calculate grade based on average score
    public static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
