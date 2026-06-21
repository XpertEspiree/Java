import java.util.Scanner;

// Program to perform arithmetic operations on two numbers

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display results
        System.out.println("\n----- Results -----");
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        // Check division by zero
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient = " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        sc.close();
    }
}