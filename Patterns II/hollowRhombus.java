public class hollowRhombus {

  public static void printHollowRhombus(int n) {

    for (int i = 1; i <= n; i++) {

      // For Printing Spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // For Printing Stars
      for (int j = 1; j <= n; j++) {

        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    int n = 5;
    printHollowRhombus(n);

  }
}
