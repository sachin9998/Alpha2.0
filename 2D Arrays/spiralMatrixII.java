import java.util.ArrayList;
import java.util.List;

public class spiralMatrixII {

  public static List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> ans = new ArrayList<>();

    int row = matrix.length;
    int col = matrix[0].length;

    int count = 0;
    int total = row * col;

    int startingRow = 0;
    int endingRow = row - 1;

    int startingCol = 0;
    int endingCol = col - 1;

    ans.add(10);

    while (count < total) {

      startingRow++;
      endingRow--;
      startingCol++;
      endingCol--;
    }

    return ans;
  }

  public static void main(String[] args) {
    int matrix[][] = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };

    int uttar = find_element(matrix, 4, 4, 7);
    System.out.println(uttar);
  }

  public static int find_element(int a[][], int r, int c, int k) {

    // Finding size of matrix
    int row = a.length;
    int column = a[0].length;
    int total = r * c;
    int count = 0;
    int ans = 0;

    // Index Intialisation
    int startingRow = 0;
    int endingRow = row - 1;
    int startingCol = 0;
    int endingCol = column - 1;

    while (count < total) {

      // Starting Row
      for (int i = startingCol; count < total && i <= endingCol; i++) {
        ans = a[startingRow][i];
        count++;

        if (count == k) {
          return ans;
        }
      }
      startingRow++;

      // Ending Column
      for (int i = startingRow; count < total && i <= endingRow; i++) {

        ans = a[i][endingCol];
        count++;

        if (count == k) {
          return ans;
        }
      }
      endingCol--;

      // Ending Row
      for (int i = endingCol; count < total && i >= startingCol; i--) {
        ans = a[endingRow][i];
        count++;

        if (count == k) {
          return ans;
        }
      }
      endingRow--;

      // Starting Column
      for (int i = endingRow; count < total && i >= startingRow; i--) {
        ans = a[i][startingCol];
        count++;

        if (count == k) {
          return ans;
        }
      }
      startingCol++;

    }

    return ans;
  }

}
