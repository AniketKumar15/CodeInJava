import java.util.Scanner;

public class reverseStarPattern1 {
  public static void main(String[] args) {

    System.out.print("Enter the no. rows : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println(" ");
    }

    sc.close();
  }
}
/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */