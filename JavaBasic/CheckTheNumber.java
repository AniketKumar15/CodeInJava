import java.util.Scanner;

public class CheckTheNumber {
  public static void main(String[] args) {
    System.out.println("Enter an Number : ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();

    if (num > 0) {
      if (num % 2 == 0) {
        System.out.println(num + " is Even Number.");
      } else {
        System.out.println(num + " is Odd Number.");
      }
    }
    s.close();
  }
}
