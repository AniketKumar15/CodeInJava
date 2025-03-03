import java.util.Scanner;

public class SearchElement {
  public static void main(String[] args) {
    int arr[] = { 25, 42, 38, 60, 77, 13, 90, 20, 37 };
    System.out.print("Enter a number -> ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == n) {
        System.out.println("Number is found at index -> " + i);
        break;
      } else if (arr[i] != n && i == arr.length - 1) {
        System.out.println("Item not found in the array");
      }
    }
    sc.close();
  }
}
