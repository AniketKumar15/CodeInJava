import java.util.Scanner;

public class VowelChecker {
  public static void isVowel(char ch) {
    char y = Character.toLowerCase(ch);

    // Cheking the given char is alphanet or not
    if (Character.isAlphabetic(y)) {

      // if char is alphabet then compare it with a,e,i,o,u
      if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') {
        System.out.println(y + " is vowel");
      } else {
        System.out.println(y + " is a Consonant.");
      }
    }
    // if given char is not an alphabet then print invaild input
    else {
      System.out.println("Invaild letter");
    }
  }

  public static void main(String[] args) {
    // Getting user input
    System.out.println("Enter a Alphabet : ");
    Scanner sc = new Scanner(System.in);
    // input ch in charAt 0 index
    char ch = sc.next().charAt(0);

    // Calling funtion
    isVowel(ch);

    sc.close();
  }
}
