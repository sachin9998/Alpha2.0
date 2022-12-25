public class kadaneAlgorithm {

  public static void kadane_algorithm(int arr[]) {

    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {

      currentSum = currentSum + arr[i];

      if (currentSum < 0) {
        currentSum = 0;
      }

      maxSum = Math.max(maxSum, currentSum);

    }

    System.out.println("Maximum sum using Kadane Algorithm is " + maxSum);

  }

  public static void main(String[] args) {
    int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    kadane_algorithm(arr);
  }
}
