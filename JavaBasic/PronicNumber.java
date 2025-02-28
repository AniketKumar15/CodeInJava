import java.util.Scanner;

public class PronicNumber {
  public static void main(String[] args) {
    System.out.print("Enter a number to check pronic -> ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = 0;

    for (int i = 1; i <= n / 2; i++) {
      res = i * (i + 1);
      if (res == n) {
        break;
      }
    }

    if (res == n)
      System.out.println(n + " is a pronic number.");
    else
      System.out.println("Not a pronic number");
    sc.close();
  }
}
