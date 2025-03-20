import java.util.Scanner;

public class MenuDriven {
  static void fibonacci() {
    System.out.println("\nHii! I print the first 10 series of fibonacci");
    int num1 = 0, num2 = 1;
    int series = 0;
    System.out.print(num1 + ", " + num2);
    for (int i = 0; i < 8; i++) {
      series = num1 + num2;
      num1 = num2;
      num2 = series;
      System.out.print(", " + series);
    }
  }

  static void digitSum() {
    System.out.print("\nHii! I can find the sum of given digit\nEnter the digit -> ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    while (num != 0) {
      int temp = num % 10;
      sum += temp;
      num /= 10;
    }
    System.out.println("Sum of given digit is -> " + sum);
    sc.close();
  }

  public static void main(String[] args) {
    System.out.println("Choose an one option : \n1 for Print 10 fibonacci series\n2 for sum of digit");
    System.out.print("Enter an option - >");
    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();

    switch (opt) {
      case 1:
        fibonacci();
        break;
      case 2:
        digitSum();
        break;
      default:
        System.out.println("Pls enter valid option");
        break;
    }
    sc.close();
  }
}