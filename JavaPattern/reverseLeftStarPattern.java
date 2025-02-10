import java.util.Scanner;

public class reverseLeftStarPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting the input from the user
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    // Generating reverse left star pattern
    for (int i = 1; i <= n; i++) {
      // Printing the spaces
      for (int j = 1; j < i; j++) {
        System.out.print("  ");
      }

      // here we print the actual star Printing stars
      for (int k = i; k <= n; k++) {
        System.out.print("* ");
      }

      System.out.println(); // Move to next line
    }

    sc.close();
  }
}
