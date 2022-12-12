public class invertedPyramid {

  public static void printPattern(int n) {

    // For printing total lines/rows
    for (int i = 1; i <= n; i++) {

      // For Printing Spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // For Printing Stars
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }

      System.out.println();
    }

  }

  public static void main(String[] args) {

    int n = 4;
    printPattern(n);

  }

}
