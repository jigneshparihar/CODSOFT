import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\nStudent " + i);
            double totalMarks = 0.0;
            
            System.out.print("Enter the number of subjects for student " + i + ": ");
            int numSubjects = scanner.nextInt();
            
            for (int j = 1; j <= numSubjects; j++) {
                System.out.print("Enter marks obtained in subject " + j + " (out of 100): ");
                double marks = scanner.nextDouble();
                totalMarks += marks;
            }
            
            double averagePercentage = totalMarks / numSubjects;
            char grade = calculateGrade(averagePercentage);
            
            System.out.println("\nResults for Student " + i + ":");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
        }
    }
    
    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
