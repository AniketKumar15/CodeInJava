// Java code to replace <|name|> with the user given name in a string.

import java.util.Scanner;

public class ReplaceName {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a name you want -> ");
    String nameUser = sc.nextLine();
    String text = "Dear <|name|>, I am happy to know that you pass the exam.";

    System.out.println("After replacing the name -> ");
    System.out.println(text.replace("<|name|>", nameUser));
    sc.close();
  }
}
