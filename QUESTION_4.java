import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        try {
            System.out.print("Enter first integer: ");
            num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            System.out.println("Program Execution Completed");
            sc.close();
        }
    }
}

