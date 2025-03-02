import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How much element you have to add -> ");
    int n = sc.nextInt();
    int sum = 0;
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter an array " + (i + 1) + " element -> ");
      arr[i] = sc.nextInt();
      sum += arr[i];
    }

    System.out.println("Sum of array element is -> " + sum);
    sc.close();
  }
}
