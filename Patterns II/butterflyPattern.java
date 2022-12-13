public class butterflyPattern {

  public static void printButterflyPattern(int n) {

    // 1st Half
    // Outer loop
    for (int i = 1; i <= n; i++) {

      // Stars - i
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      // Spaces - 2*(n-i)
      for (int k = 1; k <= 2 * (n - i); k++) {
        System.out.print("  ");
      }
      // Stars
      for (int l = 1; l <= i; l++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // 2nd Half
    // Outer loop
    for (int i = n; i >= 1; i--) {

      // Stars - i
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      // Spaces - 2*(n-i)
      for (int k = 1; k <= 2 * (n - i); k++) {
        System.out.print("  ");
      }
      // Stars
      for (int l = 1; l <= i; l++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {

    int n = 5;

    printButterflyPattern(n);
  }
}
