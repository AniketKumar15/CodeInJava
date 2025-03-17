import java.util.Scanner;

public class PalindromeString {
  static boolean checkPalindrome(String text) {
    text = text.toLowerCase();
    String temp = "";

    for (int i = text.length() - 1; i >= 0; i--) {
      temp = temp + text.charAt(i);
    }

    return text.equals(temp);
  }

  public static void main(String[] args) {
    System.out.print("Enter a String -> ");
    Scanner sc = new Scanner(System.in);
    String text = sc.next();

    boolean res = checkPalindrome(text);

    if (res) {
      System.out.println("Given String Is Palindrome");
    } else {
      System.out.println("Given String Is not Palindrome");
    }
    sc.close();
  }
}
