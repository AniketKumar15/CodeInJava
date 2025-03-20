public class PatternSecond {
  public static void main(String[] args) {
    int rows = 5;

    // First approch by using and boolean
    System.out.println("Printing pattern with using boolean : ");
    boolean isOnePrinted;
    for (int i = 1; i <= rows; i++) {
      isOnePrinted = false;
      for (int j = 1; j <= i; j++) {
        if (!isOnePrinted) {
          System.out.print("1" + " ");
          isOnePrinted = true;
        } else if (isOnePrinted) {
          System.out.print("0" + " ");
          isOnePrinted = false;
        }
      }
      System.out.println();
    }

    // Second approch without using boolean
    System.out.println("\nPrinting pattern without using boolean : ");
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j % 2 + " "); // This line print 1 if odd and 0 if even
      }
      System.out.println();
    }
  }

}
