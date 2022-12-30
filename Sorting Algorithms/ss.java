public class ss {

  public static void selection_sort(int arr[]) {
    int n = arr.length;

    // Outer loop
    for (int i = 0; i < n - 1; i++) {
      int min = i;

      // Inner loop
      for (int j = i + 1; j < n; j++) {
        // We get index of smallest element
        if (arr[j] > arr[min]) {
          min = j;
        }
      }

      if (min != i) {
        swap(arr, min, i);
      }

    }
  }

  // Swap function
  public static void swap(int arr[], int min, int i) {

    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;

  }

  public static void main(String[] args) {
    int myarr[] = { 4, 1, 9, 2, 3, 6 };
    selection_sort(myarr);

    System.out.println(myarr[0]);
    System.out.println(myarr[1]);
    System.out.println(myarr[2]);
    System.out.println(myarr[3]);
    System.out.println(myarr[4]);
    System.out.println(myarr[5]);

  }
}
