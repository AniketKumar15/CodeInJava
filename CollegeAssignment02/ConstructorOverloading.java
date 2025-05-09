// Write a program to show the use of constructor overloading in java.
import java.io.*;

class TestCode {
	TestCode() {
		System.out.println("No Value to print");
	}
	TestCode(int a) {
		System.out.println("Value of A is : " + a);
	}
	TestCode(int a, int b) {
		System.out.println("Addition : "+ (a+b));
	}
	TestCode(float a, float b) {
		System.out.println("Addition : "+ (a+b));
	}
}

public class ConstructorOverloading {
	public static void main (String[] args) {
		TestCode t1 = new TestCode(10);
		TestCode t2 = new TestCode(4,6);
		TestCode t3 = new TestCode(9.3f, 10.2f);
	}
}