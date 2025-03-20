public class NotContainZero {
  public static boolean checkContainsZero(int num) {
    while (num > 0) {
      if (num % 10 == 0) {
        return true;
      }
      num /= 10;
    }
    return false;
  }

  public static void main(String[] args) {
    int minRange = 100;
    int maxRange = 200;
    System.out.println("All numbers between 100 and 200 that do not contain zero:");

    for (int i = minRange; i <= maxRange; i++) {
      if (checkContainsZero(i) == false) {
        System.out.print(i + " ");
      }
    }
  }

}
