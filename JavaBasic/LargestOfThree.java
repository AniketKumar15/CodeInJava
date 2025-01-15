import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {
    System.out.println("Enter The three number : ");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    if (num1 == num2 && num1 == num3) {
      System.out.println("All numbers are equal");
    } else {
      if (num1 > num2 && num1 > num3) {
        System.out.println(num1 + " is the greatest");
      } else if (num2 > num1 && num2 > num3) {
        System.out.println(num2 + " is the greatest");
      } else if (num3 > num2 && num3 > num1) {
        System.out.println(num1 + " is the greatest");
      }
    }
    sc.close();
  }
}
