import java.util.Scanner;

public class LargestElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How much element you have to insert in array -> ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int max, min;
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter array " + (i + 1) + " element -> ");
      arr[i] = sc.nextInt();
    }
    max = arr[0];
    min = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      } else if (min > arr[i]) {
        min = arr[i];
      }
    }

    System.out.println("The Largest element of array is -> " + max + "\nThe smallest element of array is -> " + min);
    sc.close();
  }
}
