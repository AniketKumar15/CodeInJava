import java.util.Scanner;

public class compoundInterest {

  static void findCI(double p, double r, double t) {

    // Calculating the ci and print its value
    double ci = p * (Math.pow((1 + r / 100), t));

    System.out.println("The Simple interest = " + ci);
  }

  public static void main(String[] args) {
    // Getting user input
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principle Amount : ");
    double p = sc.nextFloat();
    System.out.print("Enter the Interest Rate : ");
    double r = sc.nextFloat();
    System.out.print("Enter the Time(year) : ");
    double t = sc.nextFloat();

    // Calling the funtion
    findCI(p, r, t);
    sc.close();
  }
}
