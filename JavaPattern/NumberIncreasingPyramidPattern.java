import java.util.Scanner;

public class NumberIncreasingPyramidPattern {
  public static void main(String[] args) {
    System.out.print("Enter the number of rows : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
