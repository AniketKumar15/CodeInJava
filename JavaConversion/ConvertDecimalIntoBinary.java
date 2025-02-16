import java.util.Scanner;

public class ConvertDecimalIntoBinary {

  static void decToBinary(int n) {
    int i = 1, rem = 0;
    int bNumber = 0;
    System.out.print("The Binary number is : ");
    while (n > 0) {
      rem = n % 2;
      bNumber += i * rem;
      i *= 10;
      n = n / 2;
    }
    System.out.println(bNumber);
  }

  static void decToBinaryUsingStringBulider(int n) {
    StringBuilder binaryNumber = new StringBuilder();
    int rem = 0;
    while (n > 0) {
      rem = n % 2;
      binaryNumber.append(rem);
      n /= 2;

    }
    System.out.println("The binary Number(using StringBulider) is : " + binaryNumber.reverse());
  }

  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("The Number is : " + n);

    decToBinary(n);
    decToBinaryUsingStringBulider(n);
    sc.close();
  }
}
/*
 * StringBuilder is a Java class used to efficiently manipulate strings.
 * Unlike String, which creates a new object every time you modify it,
 * StringBuilder modifies the existing object, making it much faster for string
 * operations like concatenation and reversal.
 */