import java.util.Scanner;

public class AddNumber {
  public static void main(String[] args) {
    System.out.println("Enter a two number -> ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = a + b;
    System.out.println("Sum of two number is -> " + sum);
    sc.close();
  }
}
