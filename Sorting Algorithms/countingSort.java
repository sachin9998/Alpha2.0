public class countingSort {
  // For Sorting Small Numbers

  public static void counting_sort(int arr[]) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      int a = count[arr[i]]++;
      System.out.println(a);
    }

    // Sorting

  }

  public static void main(String[] args) {
    int arr[] = { 1, 7, 4, 9, 3, 2, 4, 1, 5 };
    counting_sort(arr);

    int count = 65;
    System.out.println((char) count);
  }
}
