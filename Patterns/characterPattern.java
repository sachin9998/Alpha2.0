public class characterPattern {
  public static void main(String[] args) {

    int n = 4;

    char count = 'A';

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(count);
        count++;
      }

      System.out.println();
    }

  }
}
