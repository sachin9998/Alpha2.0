import java.util.Scanner;

public class checkPrime {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    boolean isPrime = true;

    for (int i = 2; i < n - 1; i++) {

      if (n % i == 0) {
        isPrime = false;
        break;
      }

    }

    if (isPrime) {
      System.out.println("The given number is prime number");
    } else {
      System.out.println("Its not a prime number");
    }

  }
}