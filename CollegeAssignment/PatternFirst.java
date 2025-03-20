public class PatternFirst {
  public static void main(String[] args) {
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      int num = 2 * i - 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num -= 2;
      }
      System.out.println();
    }
  }
}
