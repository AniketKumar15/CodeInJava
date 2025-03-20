public class PatternThird {
  public static void main(String[] args) {
    int rows = 6;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows; j++) {
        if (j < i) {
          System.out.print(i + " ");
        } else {
          System.out.print(j + " ");
        }

      }
      System.out.println();
    }
  }
}
