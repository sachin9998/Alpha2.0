public class hollowRectangle {

  public static void hollow_rectangle(int totalRows, int totalColumns) {

    // Outer loop - Rows
    for (int i = 1; i <= totalRows; i++) {

      // Inner loop - Columns
      for (int j = 1; j <= totalColumns; j++) {
        // Cell - (i, j)

        if (i == 1 || i == totalRows || j == 1 || j == totalColumns) {
          // Boundary cells
          System.out.print("*");

        } else {
          System.out.print(" ");
        }

      }
      System.out.println();

    }

  }

  public static void main(String[] args) {

    hollow_rectangle(4, 5);

  }
}