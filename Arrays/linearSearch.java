public class linearSearch {

  public static int linear_Search(int numbers[], int key) {

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key)
        return i;
    }

    return -1;

  }

  public static void main(String[] args) {

    // Linear Search Implementation | Key = 10
    int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    int key = 10;

    int index = linear_Search(arr, key);

    if (index == -1) {
      System.out.println("Key not found");
    } else {
      System.out.println("Key is at index " + index);
    }

  }
}
