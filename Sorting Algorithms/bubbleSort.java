
public class bubbleSort {

  public static void bubble_sort(int arr[]) {
    int n = arr.length;

    for (int round = 0; round < arr.length - 1; round++) {
      boolean swapped = false;
      for (int j = 0; j < arr.length - round - 1; j++) {
        if (arr[j] > arr[j + 1]) {

          // Swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          // Mark swapped true
          swapped = true;
        }
      }
      
      if (swapped == false) {
        break;
      }
    }

  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 5, 4, 1, 3, 2 };
    bubble_sort(arr);
    printArr(arr);
  }

}
