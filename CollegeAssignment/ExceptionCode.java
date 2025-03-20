public class ExceptionCode {
  public static void main(String[] args) {
    int m = 5, n = 0;

    try {
      System.out.println("Division value -> " + m / n);
    } catch (ArithmeticException at) {
      System.out.println("Exception caught: Cannot divide by zero!");
      System.out.println("Error is -> " + at.getMessage());
    }
  }
}
