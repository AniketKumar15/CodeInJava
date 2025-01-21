import java.lang.Math;
import java.util.Scanner;

public class ArmstrongNum {
  static boolean checkArmStrong(int number) {
    int temp = number;
    int res = 0, count = 0;

    // Count the total digits in a number
    // #region
    if (temp == 0)
      count = 1;

    while (temp != 0) {

      // Remove rightmost digit
      temp = temp / 10;

      // Increment digit count by 1
      ++count;
    }
    // #endregion

    temp = number;
    while (temp > 0) {
      int num = temp % 10;
      res += Math.pow(num, count);
      temp /= 10;
    }

    if (res == number) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {

    System.out.println("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    boolean isArmStrong = checkArmStrong(a);
    if (isArmStrong) {
      System.out.println(a + " is Armstrong Number");
    } else {
      System.out.println(a + " is not Armstrong Number");
    }

    sc.close();
  }
}
