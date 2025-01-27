import java.util.Scanner;

public class SimpleInterest {

  static void SICalculator(float p, float r, float t) {

    // Calculating the si and print its value
    float si = (p * r * t) / 100;

    System.out.println("The Simple interest = " + si);
  }

  public static void main(String[] args) {
    // Getting user Input
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principle Amount : ");
    float p = sc.nextFloat();
    System.out.print("Enter the Interest Rate : ");
    float r = sc.nextFloat();
    System.out.print("Enter the Time(year) : ");
    float t = sc.nextFloat();

    // Calling the funtion
    SICalculator(p, r, t);
    sc.close();
  }
}
