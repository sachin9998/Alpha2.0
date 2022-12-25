public class kadane_Striver {
  public static int maxSumSubarray(int arr[]) {

    int maxSum = arr[0];
    int currentSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {

      currentSum = currentSum + arr[i];

      if (currentSum > maxSum) {
        maxSum = currentSum;
      }

      if (currentSum < 0) {
        currentSum = 0;
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {

    int ans[] = { 5, -4, -2, 6, -1 };
    System.out.println("Answer is " + maxSumSubarray(ans));

  }
}
