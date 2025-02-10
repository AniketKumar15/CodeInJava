import java.util.Scanner;

public class NumberChangingReversePyramidPattern {
  public static void main(String[] args) {
    System.out.print("Enter the number of rows : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = (n * (n + 1)) / 2;

    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num--;
      }
      System.out.println(" ");
    }
    sc.close();
  }
}
