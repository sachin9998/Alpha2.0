public class solidRhombus {

  public static void printSolidRhombus(int n) {

    for (int i = 1; i <= n; i++) {

      // For printing spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print("  ");
      }

      // For Printing Stars
      for (int j = 1; j <= n; j++) {
        System.out.print("*  ");
      }

      System.out.println();
    }

  }

  public static void main(String[] args) {

    int n = 5;
    printSolidRhombus(n);

  }
}
