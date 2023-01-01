import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {

  public static void main(String[] args) {
    Integer arr[] = { 34, 423, 65, 1, 123, 2 };

    // Arrays.sort(arr);

    // To sort first three elements only
    // Array.sort(Array, Starting element, Ending element)
    // Arrays.sort(arr, 0, 3);

    // Sorting from descending to ascending order
    Arrays.sort(arr, Collections.reverseOrder());
    // Arrays.sort(arr, Collections.reverseOrder());

    for (int i : arr) {
      System.out.println(i);
    }

  }
}
