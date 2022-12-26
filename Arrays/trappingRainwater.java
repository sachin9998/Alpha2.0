public class trappingRainwater {

  public static int trappingRainwaterSolution(int height[]) {

    // Array length
    int n = height.length;

    // Calculate left max boundary - Array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];

    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    // Calculate right max boundary - Array
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];

    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    // Loop ->
    // waterLevel = min(leftMaxBoundary, rightMaxBoundary)
    // trapped Water = waterLevel - height[i]

    int count = 0;
    return count;
  }

  public static void main(String[] args) {
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };

    System.out.println("The amount of water that can be trapped between the blocks during the rainy season is "
        + trappingRainwaterSolution(height));
  }

}