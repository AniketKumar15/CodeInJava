import java.util.Scanner;

public class SquareFillPattern {
  public static void main(String[] args) {

    // Take user input
    System.out.print("Enter the no. rows : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    sc.close();
  }
}
