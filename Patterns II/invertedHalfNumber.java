public class invertedHalfNumber {

  public static void inverted_half_pyramid_number(int n) {

    for (int i = 1; i <= n; i++) {

      // For Printing number
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {

    int n = 5;
    inverted_half_pyramid_number(n);

  }
}
