import java.util.Scanner;

// Program to calculate grade and display numbers from 1 to 100

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter student's marks (0-100): ");
        int marks = sc.nextInt();

        // Determine grade
        System.out.print("Grade: ");

        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // Display numbers from 1 to 100
        System.out.println("\nNumbers from 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}