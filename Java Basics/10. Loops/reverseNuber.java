import java.util.Scanner;

public class reverseNuber {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int rev = 0;

    while (n != 0) {
      int last = n % 10;
      rev = (rev * 10) + last;

      n = n / 10;
    }

    System.out.println("Reverse number is " + rev);
  }
}
