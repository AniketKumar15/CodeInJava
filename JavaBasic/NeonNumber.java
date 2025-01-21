
public class NeonNumber {

  static void neonNumberChecker(int n) {
    int square = n * n;
    int sum = 0;

    while (square > 0) {
      int temp = square % 10;
      sum += temp;
      square /= 10;
    }
    if (sum == n) {
      System.out.println(n + " is a neon Number");
    } else {
      System.out.println(n + " is not a neon Number");
    }
  }

  public static void main(String[] args) {
    int a = 10;
    neonNumberChecker(a);
  }
}
