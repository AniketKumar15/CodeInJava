import java.util.Scanner;

public class LeapYear {
  public static boolean LeapYearCheaker(int year) {
    if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    } else if (year % 4 == 0) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    System.out.println("Enter a Year : ");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    boolean isLeapYear = LeapYearCheaker(year);

    if (isLeapYear) {
      System.out.println(year + " is Leap Year");
    } else {
      System.out.println(year + " is Not Leap Year");
    }
    sc.close();
  }
}
