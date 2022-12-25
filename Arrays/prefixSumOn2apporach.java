public class prefixSumOn2apporach {
  public static void maxSubarray(int arr[]) {

    int currentSum = 0;
    int maxSum = arr[0];

    for (int i = 0; i < arr.length; i++) {
      currentSum = 0;

      for (int j = i; j < arr.length; j++) {
        currentSum = currentSum + arr[j];
      }

      if (maxSum < currentSum) {
        maxSum = currentSum;
      }

    }
    System.out.println("Max sum = " + maxSum);
  }

  public static void main(String[] args) {
    int numbers[] = { 1, -2, 6, -1, 3 };
    maxSubarray(numbers);
  }

}
