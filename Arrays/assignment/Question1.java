
public class Question1 {

  public static boolean distinctElementsinArray(int arr[]) {
    boolean ans = false;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return true;
        }
      }
    }

    return ans;
  }

  public static void main(String[] args) {

    int nums1[] = { 1, 2, 3, 1 };
    if (distinctElementsinArray(nums1)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    int nums2[] = { 1, 2, 3, 4 };
    if (distinctElementsinArray(nums2)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    int nums3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
    if (distinctElementsinArray(nums3)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

  }
}
