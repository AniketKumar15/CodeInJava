// Java code to convert the given string into lower case

import java.util.Scanner;

public class LowerCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string you want -> ");
    String text = sc.nextLine();

    System.out.println("After converting the text into lower case -> ");
    System.out.println(text.toLowerCase());
    sc.close();
  }
}
