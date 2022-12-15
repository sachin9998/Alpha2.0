public class reverseArray {

  public static void reverse_array(int arr[]) {

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;

      start++;
      end--;
    }

  }

  public static void main(String[] args) {

    int arr[] = { 2, 4, 6, 8, 10 };
    reverse_array(arr);

    for (int i : arr) {
      System.out.println(i);
    }

  }
}
