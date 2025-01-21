import java.util.Scanner;

public class displayPrimeNumber {
  public static void main(String[] args) {
    System.out.println("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int flag = 0;

    for (int i = 1; i <= n; i++) {
      if (i == 0 || i == 1) {
        continue;
      }
      flag = 1;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = 0;
        }

      }
      if (flag == 1) {
        System.out.println(i);
      }
    }
    // System.out.println(flag);
    sc.close();
  }
}
