import java.util.Scanner;

public class factorial {

  // Factorial using normal Function
  public static void findFactorial(int num) {
    int fact = 1;

    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }

    System.out.println("Factorial of " + num + " is " + fact);
  }

  // Factorial Using Recursive Method
  public static int findFactorialRecursive(int num) {

    if (num == 0) {
      return 1;
    }
    return num * findFactorialRecursive(num - 1);
  }

  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    // function call (Factorial using normal function)
    findFactorial(num);

    // function call and print (Factorial using Recursive method)
    System.out.println("The factorial of " + num + " using Recursive method is " + findFactorialRecursive(num));
    sc.close();
  }
}
