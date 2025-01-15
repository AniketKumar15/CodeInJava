
// Code to perform Swap Two Numbers
import java.util.Scanner;

public class swapTwoNumbers {
	static void swapUsingThirdVar(int a, int b) {
		// using third variable
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping two numbers using third variable is : ");
		System.out.println("A = " + a + ", B = " + b);
	}

	static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping two numbers without using third variable is : ");
		System.out.println("A = " + a + ", B = " + b);
	}

	public static void main(String[] args) {
		int a, b;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers : ");
		a = s.nextInt();
		b = s.nextInt();

		System.out.println("Before swapping two numbers : ");
		System.out.println("A = " + a + ", B = " + b);
		swapUsingThirdVar(a, b);
		swap(a, b);
		s.close();
	}

}
