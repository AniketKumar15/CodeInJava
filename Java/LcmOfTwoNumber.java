public class LcmOfTwoNumber {
  public static void main(String[] args) {
    int a = 5, b = 2;
    int ans = (a > b) ? a : b;

    System.out.println(ans);

    while (true) {
      if (ans % a == 0 && ans % b == 0) {
        break;
      }
      ans++;
    }
    System.out.println(ans);
  }

}
