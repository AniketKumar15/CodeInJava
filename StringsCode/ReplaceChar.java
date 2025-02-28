
// Java code to replace the space with the underscore in a given string
import java.util.Scanner;

public class ReplaceChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string you want -> ");
    String text = sc.nextLine();

    System.out.println("After replacing the all spaces with the underscore -> ");
    System.out.println(text.replace(" ", "_"));
    sc.close();
  }
}
