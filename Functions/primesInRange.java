import java.util.Scanner;

public class primesInRange {

  // Check for Prime
  public static boolean isPrime(int n) {

    if (n == 2) {
      return true;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

  // Printing every prime number
  public static void primeRange(int n) {

    for (int i = 1; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }

    }

  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    primeRange(n);

  }

}
