public class ReverseArray {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int tem[] = new int[arr.length];

    System.out.println("Array before Reverse :");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      tem[arr.length - i - 1] = arr[i];
    }
    System.out.println();
    System.out.println("Array After Reverse :");
    for (int i = 0; i < tem.length; i++) {
      System.out.print(tem[i] + " ");
    }
  }
}
