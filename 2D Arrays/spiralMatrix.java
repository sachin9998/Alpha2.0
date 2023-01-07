public class spiralMatrix {

  public static void main(String[] args) {

    int matrix[][] = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };

    printSpiral(matrix);

  }

  public static void printSpiral(int matrix[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {

      // Top
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(matrix[startRow][j] + " ");
      }

      // Right
      for (int j = startRow + 1; j <= endRow; j++) {
        System.out.print(matrix[j][endCol] + " ");
      }

      // Bottom
      for (int j = endCol - 1; j >= startCol; j--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(matrix[endRow][j] + " ");
      }

      // Left
      for (int j = endCol - 1; j >= startRow + 1; j--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(matrix[j][startCol] + " ");
      }

      startRow++;
      startCol++;
      endRow--;
      endCol--;

    }



  }
}
