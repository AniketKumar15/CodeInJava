import java.util.Scanner;

public class ConvertBinaryToDecimal {

  static void binaryChecker(int num) {
    int j, temp = num;
    while (num > 0) {
      j = num % 10;
      // System.out.println(j);
      if (j != 0 && j != 1) {
        System.out.println("Given number is not in binary");
        break;
      }
      num = num / 10;
      if (num == 0) {
        binaryToDecimal(temp);
      }
    }
  }

  static void binaryToDecimal(int n) {
    int rem, decimalNumber = 0, i = 0, temp = n;

    while (temp > 0) {
      rem = temp % 10;
      decimalNumber += rem * Math.pow(2, i);
      i += 1;
      temp = temp / 10;
    }

    System.out.println("The decimal conversion of " + n + " is : " + decimalNumber);
  }

  public static void main(String[] args) {
    System.out.print("Enter a binary Number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    binaryChecker(n);

    sc.close();
  }
}
