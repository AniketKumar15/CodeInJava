import java.util.Scanner;

public class Vowel {
  public static void main(String[] args) {
    System.out.print("Enter any text you want -> ");
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    text = text.toLowerCase();

    int vowelCount = 0, consonantCount = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
        if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
            || text.charAt(i) == 'u') {
          vowelCount++;
        } else {
          consonantCount++;
        }
      }
    }

    System.out.println("Total no of vowel in text -> " + vowelCount);
    System.out.println("Total no of consonant in text -> " + consonantCount);
    sc.close();

  }
}
