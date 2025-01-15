
// Code to perform basic Math operations
import java.util.Scanner;

public class BasicMathOperations {
    public static void main(String[] args) {
        int a, b;

        System.out.println("Enter the integer: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("Addtion of " + a + " and " + b + " is : " + (a + b));
        System.out.println("Subtraction of " + a + " and " + b + " is : " + (a - b));
        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
        System.out.println("Division of " + a + " and " + b + " is : " + (a / b));
        System.out.println("Modulus of " + a + " and " + b + " is : " + (a % b));
        s.close();
    }
}
