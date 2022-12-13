public class diamondPatter {

  public static void printDiamond(int n) {

    // Upper Part
    for (int i = 1; i <= n; i++) {

      // For printing spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }

      // For Printing Starts
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }

    // Lower part

    for (int k = n; k >= 0; k--) {

      // For printing spaces
      for (int j = 1; j <= n - k; j++) {
        System.out.print("  ");
      }

      // For Printing Starts
      for (int j = 1; j <= (2 * k) - 1; j++) {
        System.out.print("* ");
      }

      System.out.println();

    }

  }

  public static void main(String[] args) {

    int n = 4;
    printDiamond(n);

  }
}
