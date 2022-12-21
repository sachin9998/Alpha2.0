public class maxSubarraySum {

  public static void maxSubarray(int arr[]) {

    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int start = i;

      for (int j = i; j < arr.length; j++) {
        int end = j;

        currentSum = 0;
        for (int k = start; k <= end; k++) {

          // subarray sum
          currentSum = currentSum + arr[k];
        }
        System.out.print(currentSum + " ");
        if (maxSum < currentSum) {
          maxSum = currentSum;
        }

      }
    }
    System.out.println();
    System.out.println("Max sum = " + maxSum);

  }

  public static void main(String[] args) {

    // BRUTE FORCE
    int arr[] = { 1, -2, 6, -1, 3 };
    maxSubarray(arr);
  }
}
