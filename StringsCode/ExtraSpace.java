// Java code to detect the extra space in a string

import java.util.Scanner;

public class ExtraSpace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string you want -> ");
    String text = sc.nextLine();

    System.out.println("After removing all the extra spaces -> ");
    System.out.println(text.replaceAll("\\s+", " "));
    sc.close();
  }
}
